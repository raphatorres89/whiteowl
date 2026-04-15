package com.raphaowl.whiteowl.service;

import java.util.List;

import com.raphaowl.whiteowl.model.CharacterClass;
import com.raphaowl.whiteowl.repository.CharacterClassRepository;

import org.springframework.stereotype.Service;

@Service
public class CharacterClassService {

    private final CharacterClassRepository characterClassRepository;

    public CharacterClassService(CharacterClassRepository characterClassRepository) {
        this.characterClassRepository = characterClassRepository;
    }

    public List<CharacterClass> findAll() {
        return characterClassRepository.findAll();
    }

    public CharacterClass findBySlug(String slug) {
        List<CharacterClass> all = findAll();
        return all.stream()
                .filter(c -> c.slug().equalsIgnoreCase(slug))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Class not found: " + slug));
    }
}