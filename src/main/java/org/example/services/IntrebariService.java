package org.example.services;

import org.example.DTO.IntrebariDTO;
import org.example.repository.IntrebariRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntrebariService {

    private final IntrebariRpository intrebariRepository;

    @Autowired
    public IntrebariService(IntrebariRpository intrebariRepository) {
        this.intrebariRepository = intrebariRepository;
    }

    public List<IntrebariDTO> getAllIntrebari() {
        return intrebariRepository.getAllIntrebari();
    }

    public List<IntrebariDTO> getAllIntrebariDupaExamen(Long examenId) {
        return intrebariRepository.findByExamenId(examenId);
    }
}
