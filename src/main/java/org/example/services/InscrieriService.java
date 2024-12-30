package org.example.services;

import org.example.DTO.InscrieriDTO;
import org.example.repository.InscrieriRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class InscrieriService {

    private final InscrieriRepository inscrieriRepository;


    public InscrieriService(InscrieriRepository inscrieriRepository) {
        this.inscrieriRepository = inscrieriRepository;
    }

    public List<InscrieriDTO> afiseazaNote() {
        return inscrieriRepository.getExamsAndGrades();
    }

    public HashMap<String, Float> calcualeazaProcentPromoPerExamen() {
        List<InscrieriDTO> tabelaInscrieriGrupataPeExamene =  inscrieriRepository.getPromoPerExamen();
        List<InscrieriDTO> tabelaInscrieri =  inscrieriRepository.getExamsAndGrades();
        HashMap<String, Float> promoPerExamen = new HashMap<>();

        for(InscrieriDTO examData: tabelaInscrieri){
            String examId = examData.getExamen_id().toString();

            String etichetaExamen = examData.getEtichetaExamen();

            long totalInscrieriPerExamen = tabelaInscrieriGrupataPeExamene.stream()
                    .filter(inscriereGrupata -> inscriereGrupata.getExamen_id().toString().equals(examId))
                    .findFirst()
                    .map(InscrieriDTO::getTotalExameneSustinute)
                    .orElse(0L);

            long totalNoteMaiMariDePatru = tabelaInscrieri.stream()
                    .filter(inscriere -> inscriere.getExamen_id().toString().equals(examId) && inscriere.getNota() > 4)
                    .count();

            float procentajPromovare = (float) totalNoteMaiMariDePatru / totalInscrieriPerExamen * 100;

            promoPerExamen.put(etichetaExamen, procentajPromovare);
        }

        return promoPerExamen;
    }
}
