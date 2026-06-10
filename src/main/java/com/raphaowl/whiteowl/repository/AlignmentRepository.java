package com.raphaowl.whiteowl.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;

import com.raphaowl.whiteowl.model.Alignment;

import org.springframework.stereotype.Component;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class AlignmentRepository {

    private Map<String, Alignment> alignmentMap;

    @PostConstruct
    public void init(){
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream("data/alignment.json");

        alignmentMap = objectMapper.readValue(is, new TypeReference<List<Alignment>>() {})
                .stream()
                .collect(Collectors.toMap(
                        Alignment::slug,
                        Function.identity()));
    }

    public List<Alignment> findAll(){
        return alignmentMap.values().stream().toList();
    }

    public Optional<Alignment> findBySlug(String slug){
        return Optional.ofNullable(alignmentMap.get(slug));
    }
}
