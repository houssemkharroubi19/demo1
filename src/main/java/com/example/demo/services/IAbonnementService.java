package com.example.demo.services;

import  com.example.demo.entities.Abonement;
import com.example.demo.entities.Cours;
import java.util.List;

public interface IAbonnementService {
    List<Abonement> retrieveAllAbonnements();
    Abonement addAbonnement(Abonement abonnement);
    Abonement updateAbonnement (Abonement abonnement);
    Abonement retrieveAbonnement(Long numAbonnement);
    void remove(Long id);
}
