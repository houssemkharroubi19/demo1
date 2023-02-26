package com.example.demo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Abonement;
import com.example.demo.repositories.AbonnementRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class AbonnementServiceImpl implements IAbonnementService {
    private AbonnementRepo abonnementRepo;

    @Override
    public List<Abonement> retrieveAllAbonnements() {
        return abonnementRepo.findAll();
    }

    @Override
    public Abonement addAbonnement(Abonement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonement updateAbonnement(Abonement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonement retrieveAbonnement(Long numAbonnement) {
        return abonnementRepo.findById(numAbonnement).orElse(null);
    }

    @Override
    public void remove(Long id) {
        abonnementRepo.deleteById(id);

    }
}
