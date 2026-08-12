package com.raphaowl.whiteowl.service;

import java.util.List;

import com.raphaowl.whiteowl.enums.CategoryEnum;
import com.raphaowl.whiteowl.model.Item;
import com.raphaowl.whiteowl.repository.ItemRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<Item> findByCategory(CategoryEnum category) {
        return itemRepository.findByCategory(category);
    }
}
