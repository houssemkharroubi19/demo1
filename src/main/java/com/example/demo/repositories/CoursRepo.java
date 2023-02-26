package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Cours;

@Repository
public interface CoursRepo extends JpaRepository<Cours,Long> {


}
