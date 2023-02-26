package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Inscription;
@Repository
public interface InscriptionRepo extends JpaRepository <Inscription,Long> {
}
