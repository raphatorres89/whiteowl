package com.raphaowl.whiteowl.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;

import com.raphaowl.whiteowl.model.Skill;

import org.springframework.stereotype.Component;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class SkillRepository {

    private Map<String, Skill> skills;

    @PostConstruct
    public void init() {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream inputStream = getClass()
                .getClassLoader()
                .getResourceAsStream("data/skills.json");

        skills = objectMapper.readValue(inputStream, new TypeReference<List<Skill>>() {})
                .stream()
                .collect(Collectors.toMap(
                        Skill::slug,
                        Function.identity()
                ));
    }

    public List<Skill> findAll() {
        return skills.values().stream().toList();
    }
}
