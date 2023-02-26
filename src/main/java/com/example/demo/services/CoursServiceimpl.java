package com.example.demo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Cours;
import com.example.demo.repositories.CoursRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class CoursServiceimpl implements ICoursService {
    private CoursRepo coursRepo;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepo.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepo.findById(numCours).orElse(null);
    }

    @Override
    public void remove(Long id) {
        coursRepo.deleteById(id);

    }
}
