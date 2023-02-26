package com.example.demo.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Abonement;
import com.example.demo.services.IAbonnementService;

import java.util.List;

@RestController
@AllArgsConstructor
public class AbonementController {
    private IAbonnementService iAbonnementService;

    @PostMapping("/add")
    public Abonement add(@RequestBody Abonement p) {
        return iAbonnementService.addAbonnement(p);
    }

    @PutMapping("/update")
    public Abonement update(@RequestBody Abonement p) {
        return iAbonnementService.updateAbonnement(p);
    }

    @GetMapping("/get/{id}")
    public Abonement get(@PathVariable("id") Long id) {
        return iAbonnementService.retrieveAbonnement(id);
    }

    @GetMapping("/getAll")
    public List<Abonement> getAll() {
        return iAbonnementService.retrieveAllAbonnements();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iAbonnementService.remove(id);
    }
}
