package org.example.services;

import org.example.DTO.IntrebariDTO;
import org.example.repository.IntrebariRpository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IntrebariService {

    private final IntrebariRpository intrebariRepository;

    public IntrebariService(IntrebariRpository intrebariRepository) {
        this.intrebariRepository = intrebariRepository;
    }

    public List<String> getAllIntrebari() {
        List<IntrebariDTO> tabelaIntrebari= intrebariRepository.getAllIntrebari();
        return tabelaIntrebari.stream().map(IntrebariDTO::getIntrebare).collect(Collectors.toList());
    }

    public List<IntrebariDTO> getAllIntrebariDupaExamen(Long examenId) {
        return intrebariRepository.findByExamenId(examenId);
    }
}
