package org.example.services;

import org.example.DTO.InscrieriDTO;
import org.example.repository.InscrieriRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscrieriService {

    private final InscrieriRepository inscrieriRepository;

    public InscrieriService(InscrieriRepository inscrieriRepository) {
        this.inscrieriRepository = inscrieriRepository;
    }

    public List<InscrieriDTO> calculeazaProcentaj() {
        return inscrieriRepository.getExamsAndGrades();
    }
}
