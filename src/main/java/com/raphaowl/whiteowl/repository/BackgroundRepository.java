package com.raphaowl.whiteowl.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;

import com.raphaowl.whiteowl.model.Background;

import org.springframework.stereotype.Component;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class BackgroundRepository {

    private Map<String, Background> backgroundMap;

    @PostConstruct
    public void init() {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream("data/backgrounds.json");

        backgroundMap = objectMapper.readValue(is, new TypeReference<List<Background>>() {})
                .stream()
                .collect(Collectors.toMap(
                        Background::slug,
                        Function.identity()));
    }

    public List<Background> findAll() {
        return backgroundMap.values().stream().toList();
    }

    public Optional<Background> findById(String id) {
        return Optional.ofNullable(backgroundMap.get(id));
    }

}
