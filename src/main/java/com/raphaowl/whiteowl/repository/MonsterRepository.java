package com.raphaowl.whiteowl.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;

import com.raphaowl.whiteowl.model.Monster;

import org.springframework.stereotype.Component;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class MonsterRepository {

    private Map<String, Monster> monsters;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream("data/monsters.json");

        monsters = mapper.readValue(is, new TypeReference<List<Monster>>() {})
                .stream()
                .collect(Collectors.toMap(
                        Monster::slug,
                        Function.identity()));
    }

    public List<Monster> findAll() {
        return monsters.values().stream().toList();
    }

    public Optional<Monster>  findById(String id) {
        return Optional.ofNullable(monsters.get(id));
    }
}
