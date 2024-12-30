package org.example.controllers;

import org.example.DTO.InscrieriDTO;
import org.example.services.InscrieriService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class InscrieriController {

    private final InscrieriService inscrieriService;

    public InscrieriController(InscrieriService inscrieriService) {
        this.inscrieriService = inscrieriService;
    }

    @GetMapping("/noteExamene")
    public List<InscrieriDTO> afiseazaInscrierile(){
        return inscrieriService.afiseazaNote();
    }

    @GetMapping("/procentPromovare")
    public HashMap<String, Float> exemenePromovate(){
        return inscrieriService.calcualeazaProcentPromoPerExamen();
    }
}
