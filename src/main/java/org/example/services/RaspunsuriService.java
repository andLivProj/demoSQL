package org.example.services;

import org.example.DTO.RaspunsuriDTO;
import org.example.repository.RaspunsuriRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaspunsuriService {

    private final RaspunsuriRepository raspunsuriRepository;


    public RaspunsuriService(RaspunsuriRepository raspunsuriRepository) {
        this.raspunsuriRepository = raspunsuriRepository;
    }

    public List<RaspunsuriDTO> getAllRaspunsuri() {
        return raspunsuriRepository.getAllRaspunsuri();
    }
}
