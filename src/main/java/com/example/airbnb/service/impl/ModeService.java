package com.example.airbnb.service.impl;


import com.example.airbnb.model.Mode;
import com.example.airbnb.repository.ModeRepository;
import com.example.airbnb.service.IModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ModeService implements IModeService {

    @Autowired
    private ModeRepository modeRepository;
    @Override
    public void save(Mode mode) {
        modeRepository.save(mode);
    }

    @Override
    public Iterable<Mode> findAll() {
        return modeRepository.findAll();
    }

    @Override
    public Optional<Mode> findById(Long id) {
        return modeRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        modeRepository.deleteById(id);
    }
}
