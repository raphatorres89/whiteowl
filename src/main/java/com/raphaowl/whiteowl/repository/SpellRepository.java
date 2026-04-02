package com.raphaowl.whiteowl.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;

import com.raphaowl.whiteowl.model.Spell;

import org.springframework.stereotype.Component;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class SpellRepository {

    private Map<String, Spell> spells;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream("data/spells.json");

        spells = mapper.readValue(is, new TypeReference<List<Spell>>() {})
                .stream()
                .collect(Collectors.toMap(
                        Spell::slug,
                        Function.identity()));
    }

    public List<Spell> findAll() {
        return spells.values().stream().toList();
    }

    public Optional<Spell> findById(String id) {
        return Optional.ofNullable(spells.get(id));
    }
}
