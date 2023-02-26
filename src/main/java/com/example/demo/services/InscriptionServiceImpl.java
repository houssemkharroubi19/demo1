package com.example.demo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Inscription;
import com.example.demo.repositories.InscriptionRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class InscriptionServiceImpl implements IInscriptionService {
    private InscriptionRepo inscriptionRepo;
    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepo.findAll();
    }

    @Override
    public Inscription addInscription(Inscription cours) {
        return null;
    }

    @Override
    public Inscription updateInscription(Inscription cours) {
        return null;
    }



    @Override
    public Inscription retrieveInscription(Long numCours) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
