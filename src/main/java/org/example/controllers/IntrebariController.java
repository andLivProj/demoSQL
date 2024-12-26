package org.example.controllers;

import org.example.model.Intrebari;
import org.example.services.IntrebariService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IntrebariController {

    private final IntrebariService intrebariService;

    public IntrebariController(IntrebariService intrebariService) {
        this.intrebariService = intrebariService;
    }

    @GetMapping("/cautaIntrebariExamen/{id}")
    public List<Intrebari> getIntrebariByExamen(@PathVariable int id) {
        return intrebariService.getIntrebariByExamen(id);
    }

    @GetMapping("/numaraIntrebariExamen/{id}")
    public Integer getCountIntrebariByExamen(@PathVariable int id) {
        return intrebariService.countIntrebariByExamen(id);
    }
}
