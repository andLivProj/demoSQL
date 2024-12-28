package org.example.controllers;

import org.example.DTO.StudentiDTO;
import org.example.services.StudentiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentiController {

    private final StudentiService studentiService;

    public StudentiController(StudentiService studentiService) {
        this.studentiService = studentiService;
    }

    @GetMapping("totiStudentii")
    public List<String> getAllStudenti() {
        return studentiService.getAllStudenti();
    }

    @GetMapping("studentiTestati")
    public List<StudentiDTO> getAllStudentiTestati() {
        return studentiService.getAllStudentiTestati();
    }

    @GetMapping("studentiCerinta")
    public List<StudentiDTO> getAllStudentiCerinta() {
        return studentiService.getAllStudentiCerinta();
    }
}
