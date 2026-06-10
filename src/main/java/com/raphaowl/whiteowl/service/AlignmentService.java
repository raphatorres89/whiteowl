package com.raphaowl.whiteowl.service;

import java.util.List;

import com.raphaowl.whiteowl.model.Alignment;
import com.raphaowl.whiteowl.repository.AlignmentRepository;

import org.springframework.stereotype.Service;

@Service
public class AlignmentService {

    private final AlignmentRepository alignmentRepository;

    public AlignmentService(AlignmentRepository alignmentRepository) {
        this.alignmentRepository = alignmentRepository;
    }

    public List<Alignment> findAll() {
        return alignmentRepository.findAll();
    }
}
