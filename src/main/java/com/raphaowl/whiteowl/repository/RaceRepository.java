package com.raphaowl.whiteowl.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;

import com.raphaowl.whiteowl.model.Race;

import org.springframework.stereotype.Component;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class RaceRepository {

    private Map<String, Race> races;

    @PostConstruct
    public void init() {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream("data/races.json");

        races = objectMapper.readValue(is, new TypeReference<List<Race>>() {})
                .stream()
                .collect(Collectors.toMap(
                        Race::slug,
                        Function.identity()));
    }

    public List<Race> findAll() {
        return races.values().stream().toList();
    }

    public Optional<Race> findById(String id) {
        return Optional.ofNullable(races.get(id));
    }

}
