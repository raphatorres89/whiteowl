package com.raphaowl.whiteowl.service;

import java.util.List;

import com.raphaowl.whiteowl.model.Race;
import com.raphaowl.whiteowl.repository.RaceRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RaceService {

    private final RaceRepository raceRepository;

    public List<Race> findAll() {
        return raceRepository.findAll();
    }

    public Race findBySlug(String slug) {
        return findAll().stream()
                .filter(race -> race.slug().equalsIgnoreCase(slug))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Race not found: " + slug));
    }
}