package org.example.controllers;

import org.example.DTO.IntrebariDTO;
import org.example.DTO.RaspunsuriDTO;
import org.example.services.RaspunsuriService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RasunsuriController {

    private final RaspunsuriService raspunsuriService;

    public RasunsuriController(RaspunsuriService raspunsuriService) {
        this.raspunsuriService = raspunsuriService;
    }

    @GetMapping("/toateRaspunsurile")
    public List<RaspunsuriDTO> getAllIntrebari() {
        return raspunsuriService.getAllRaspunsuri();
    }
}
