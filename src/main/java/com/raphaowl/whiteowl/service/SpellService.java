package com.raphaowl.whiteowl.service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import com.raphaowl.whiteowl.model.PageResult;
import com.raphaowl.whiteowl.model.Spell;
import com.raphaowl.whiteowl.model.SpellFilter;
import com.raphaowl.whiteowl.repository.SpellRepository;

import org.springframework.stereotype.Service;

@Service
public class SpellService {

    private final SpellRepository spellRepository;

    public SpellService(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    public PageResult<Spell> findAll(SpellFilter filter, int page, int size) {
        List<Spell> filtered = applyFilters(filter).stream()
                .sorted(Comparator.comparing(Spell::levelInt)
                                .thenComparing(Spell::name, String.CASE_INSENSITIVE_ORDER))
                .toList();

        int safePage = Math.max(page, 0);
        int safeSize = size <= 0 ? 12 : size;

        int fromIndex = safePage * safeSize;
        int toIndex = Math.min(fromIndex + safeSize, filtered.size());

        List<Spell> content = fromIndex >= filtered.size()
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

    private List<Spell> applyFilters(SpellFilter filter) {
        Stream<Spell> stream = spellRepository.findAll().stream();

        if (filter != null) {
            if (hasText(filter.name())) {
                String name = filter.name().trim().toLowerCase();
                stream = stream.filter(spell ->
                                               spell.name() != null &&
                                                       spell.name().toLowerCase().contains(name));
            }

            if (filter.level() != null) {
                stream = stream.filter(spell ->
                                               spell.levelInt() != null &&
                                                       spell.levelInt().equals(filter.level()));
            }

            if (hasText(filter.school())) {
                String school = filter.school().trim().toLowerCase();
                stream = stream.filter(spell ->
                                               spell.school() != null &&
                                                       spell.school().toLowerCase().equals(school));
            }

            if (Boolean.TRUE.equals(filter.ritual())) {
                stream = stream.filter(spell -> Boolean.TRUE.equals(spell.canBeCastAsRitual()));
            }

            if (Boolean.TRUE.equals(filter.concentration())) {
                stream = stream.filter(spell -> Boolean.TRUE.equals(spell.requiresConcentration()));
            }
        }

        return stream
                .sorted(Comparator.comparing(Spell::levelInt)
                                .thenComparing(Spell::name, String.CASE_INSENSITIVE_ORDER))
                .toList();
    }

    public Spell findBySlug(String slug) {
        return spellRepository.findAll().stream()
                .filter(spell -> spell.slug() != null && spell.slug().equalsIgnoreCase(slug))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Spell not found: " + slug));
    }

    public List<String> findAllSchools() {
        return spellRepository.findAll().stream()
                .map(Spell::school)
                .filter(this::hasText)
                .distinct()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
    }

    public List<Integer> findAllLevels() {
        return spellRepository.findAll().stream()
                .map(Spell::levelInt)
                .filter(Objects::nonNull)
                .distinct()
                .sorted()
                .toList();
    }

    private boolean hasText(String value) {
        return value != null && !value.trim().isEmpty();
    }
}