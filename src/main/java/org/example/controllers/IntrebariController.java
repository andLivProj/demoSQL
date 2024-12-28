package org.example.controllers;

import org.example.DTO.IntrebariDTO;
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


    @GetMapping("/numaraIntrebari")
    public Integer getCountIntrebariByExamen() {
        return intrebariService.getAllIntrebari().size();
    }

    @GetMapping("/toateIntrebarile")
    public List<String> getAllIntrebari() {
        return intrebariService.getAllIntrebari();
    }

    @GetMapping("/intrebariDupaExamen/{id}")
    public List<IntrebariDTO>  getIntrebariByExamen(@PathVariable Long id) {
        return intrebariService.getAllIntrebariDupaExamen(id);
    }

}
