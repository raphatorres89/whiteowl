package com.raphaowl.whiteowl.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;

import com.raphaowl.whiteowl.enums.CategoryEnum;
import com.raphaowl.whiteowl.model.Item;

import org.springframework.stereotype.Component;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Component
public class ItemRepository {

    private Map<String, Item> itemMap;

    @PostConstruct
    public void init() {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream("data/items.json");

        itemMap = objectMapper.readValue(is, new TypeReference<List<Item>>() {})
                .stream()
                .collect(Collectors.toMap(
                        Item::key,
                        Function.identity()));
    }

    public List<Item> findAll() {
        return itemMap.values().stream().toList();
    }

    public Optional<Item> findById(String id) {
        return Optional.ofNullable(itemMap.get(id));
    }

    public List<Item> findByCategory(CategoryEnum category) {
        return itemMap.values().stream()
                .filter(item -> item.category().key().equals(category))
                .toList();
    }

}
