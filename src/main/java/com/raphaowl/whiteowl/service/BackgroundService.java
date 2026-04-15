package com.raphaowl.whiteowl.service;

import java.util.List;

import com.raphaowl.whiteowl.model.Background;
import com.raphaowl.whiteowl.repository.BackgroundRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BackgroundService {

    private final BackgroundRepository backgroundRepository;

    public List<Background> findAll() {
        return backgroundRepository.findAll();
    }

    public Background findBySlug(String slug) {
        return backgroundRepository.findById(slug)
                .orElseThrow(() -> new RuntimeException("Background not found: " + slug));
    }
}
