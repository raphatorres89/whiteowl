package com.raphaowl.whiteowl.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;

import com.raphaowl.whiteowl.model.CharacterClass;

import org.springframework.stereotype.Component;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class CharacterClassRepository {

    private Map<String, CharacterClass> characterClasses;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream("data/classes.json");

        characterClasses = mapper.readValue(is, new TypeReference<List<CharacterClass>>() {})
                .stream()
                .collect(Collectors.toMap(
                        CharacterClass::slug,
                        Function.identity()));
    }

    public List<CharacterClass> findAll() {
        return characterClasses.values().stream().toList();
    }

    public Optional<CharacterClass>  findById(String id) {
        return Optional.ofNullable(characterClasses.get(id));
    }
}
