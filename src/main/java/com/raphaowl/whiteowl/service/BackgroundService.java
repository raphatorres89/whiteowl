package com.raphaowl.whiteowl.service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Background> findBySlug(String slug) {
        return backgroundRepository.findById(slug);
    }
}
