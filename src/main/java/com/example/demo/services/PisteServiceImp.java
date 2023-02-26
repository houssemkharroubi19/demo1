package com.example.demo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Piste;
import com.example.demo.repositories.PisteRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class PisteServiceImp implements IPisteService {
    private PisteRepo pisteRepo;
    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepo.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepo.findById(numPiste).orElse(null);
    }

    @Override
    public void remove(Long id) {
        pisteRepo.deleteById(id);
    }
}
