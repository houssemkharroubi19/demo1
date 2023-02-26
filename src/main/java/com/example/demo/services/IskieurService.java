package com.example.demo.services;

import com.example.demo.entities.Skieur;

import java.util.List;

public interface IskieurService {
    Skieur addSkieur(Skieur s);


    void removeSkieur(Long id);

    Skieur updateSkieur (Skieur s);

    List<Skieur> retrieveAllSkieurs ();

    Skieur retrieveSkieur (Long id);



}
