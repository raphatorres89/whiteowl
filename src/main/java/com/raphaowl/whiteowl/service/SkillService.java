package com.raphaowl.whiteowl.service;

import java.util.List;

import com.raphaowl.whiteowl.model.Skill;
import com.raphaowl.whiteowl.repository.SkillRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;

    public List<Skill> findAll() {
        return skillRepository.findAll();
    }
}
