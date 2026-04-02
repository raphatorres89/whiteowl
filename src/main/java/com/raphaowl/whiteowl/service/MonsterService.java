package com.raphaowl.whiteowl.service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.raphaowl.whiteowl.model.Monster;
import com.raphaowl.whiteowl.model.MonsterFilter;
import com.raphaowl.whiteowl.model.PageResult;
import com.raphaowl.whiteowl.repository.MonsterRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MonsterService {

    private final MonsterRepository monsterRepository;

    public Optional<Monster> findById(String id) {
        return monsterRepository.findById(id);
    }

    public PageResult<Monster> findAll(MonsterFilter filter, int page, int size) {
        List<Monster> filtered = applyFilters(filter).stream()
                .sorted(Comparator.comparing(Monster::name, String.CASE_INSENSITIVE_ORDER))
                .toList();

        int safePage = Math.max(page, 0);
        int safeSize = size <= 0 ? 12 : size;

        int fromIndex = safePage * safeSize;
        int toIndex = Math.min(fromIndex + safeSize, filtered.size());

        List<Monster> content = fromIndex >= filtered.size()
                ? List.of()
                : filtered.subList(fromIndex, toIndex);

        int totalPages = filtered.isEmpty() ? 1 : (int) Math.ceil((double) filtered.size() / safeSize);

        return new PageResult<>(
                content,
                safePage,
                safeSize,
                filtered.size(),
                totalPages,
                safePage > 0,
                safePage + 1 < totalPages
        );
    }

    private List<Monster> applyFilters(MonsterFilter filter) {
        Stream<Monster> monsterStream = monsterRepository.findAll().stream();

        if (filter != null) {
            if (hasText(filter.name())) {
                String name = filter.name().trim().toLowerCase();
                monsterStream = monsterStream.filter(monster ->
                                               monster.name() != null &&
                                                       monster.name().toLowerCase().contains(name));
            }

            if (hasText(filter.type())) {
                String type = filter.type().trim().toLowerCase();
                monsterStream = monsterStream.filter(monster ->
                                               monster.type() != null &&
                                                       monster.type().toLowerCase().equals(type));
            }

            if (filter.cr() != null) {
                monsterStream = monsterStream.filter(monster ->
                                               monster.cr() != null &&
                                                       monster.cr() <= filter.cr());
            }

            if (hasText(filter.environment())) {
                String environment = filter.environment().trim().toLowerCase();
                monsterStream = monsterStream.filter(monster ->
                                               monster.environments() != null &&
                                                       monster.environments().stream()
                                                               .filter(Objects::nonNull)
                                                               .map(String::toLowerCase)
                                                               .anyMatch(env -> env.equals(environment)));
            }

            if (hasText(filter.alignment())) {
                String alignment = filter.alignment().trim().toLowerCase();
                monsterStream = monsterStream.filter(monster ->
                                               monster.alignment() != null &&
                                                       monster.alignment().toLowerCase().equals(alignment));
            }

            if (Boolean.TRUE.equals(filter.legendary())) {
                monsterStream = monsterStream.filter(monster ->
                                               monster.legendaryActions() != null &&
                                                       !monster.legendaryActions().isEmpty());
            }

            return monsterStream.collect(Collectors.toList());
        }

        return monsterStream
                .sorted(Comparator.comparing(Monster::name, String.CASE_INSENSITIVE_ORDER))
                .toList();
    }

    public List<String> findAllTypes() {
        return monsterRepository.findAll().stream()
                .map(Monster::type)
                .filter(this::hasText)
                .distinct()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
    }

    public List<String> findAllEnvironments() {
        return monsterRepository.findAll().stream()
                .flatMap(monster -> monster.environments() == null
                        ? Stream.empty()
                        : monster.environments().stream())
                .filter(this::hasText)
                .distinct()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
    }

    public List<String> findAllAlignments() {
        return monsterRepository.findAll().stream()
                .map(Monster::alignment)
                .filter(this::hasText)
                .distinct()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
    }

    private boolean hasText(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
