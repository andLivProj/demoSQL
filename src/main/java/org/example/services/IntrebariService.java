package org.example.services;

import org.example.model.Intrebari;
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

    // intrebari dupa tipul de examen
    public List<Intrebari> getIntrebariByExamen(int examenId) {
        return intrebariRepository.findByExamenId(examenId);
    }

    public Integer countIntrebariByExamen(int examenId) {
        return intrebariRepository.countByExamen(examenId);
    }
}
