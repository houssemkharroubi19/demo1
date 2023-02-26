package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Skieur;

import java.util.List;

@Repository
public interface SkieurRepo extends JpaRepository<Skieur,Long> {

}
