package org.example.controllers;

import org.example.DTO.IntrebariDTO;
import org.example.services.IntrebariService;
import org.springframework.web.bind.annotation.GetMapping;
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
        List<IntrebariDTO> toateIntrebarile =  intrebariService.getAllIntrebari();
        return toateIntrebarile.size();
    }

    @GetMapping("/toateIntrebarile")
    public List<IntrebariDTO> getAllIntrebari() {
        return intrebariService.getAllIntrebari();
    }

}
