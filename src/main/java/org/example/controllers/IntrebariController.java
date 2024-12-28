package org.example.controllers;

import org.example.DTO.IntrebariDTO;
import org.example.services.IntrebariService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<String> getAllIntrebari() {
        List<IntrebariDTO> tabelaIntrebari= intrebariService.getAllIntrebari();
        return tabelaIntrebari.stream().map(IntrebariDTO::getIntrebare).collect(Collectors.toList());
    }

    @GetMapping("/intrebariDupaExamen/{id}")
    public List<IntrebariDTO>  getIntrebariByExamen(@PathVariable Long id) {
        return intrebariService.getAllIntrebariDupaExamen(id);
    }

}
