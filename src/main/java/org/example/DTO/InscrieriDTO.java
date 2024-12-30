package org.example.DTO;

import lombok.Data;

@Data
public class InscrieriDTO {

    private Long examen_id;

    private String etichetaExamen;

    private int nota;

    private Long totalExameneSustinute;

    public InscrieriDTO(Long examen_id, String etichetaExamen,  int nota) {
        this.examen_id = examen_id;
        this.etichetaExamen = etichetaExamen;
        this.nota = nota;
    }

    public InscrieriDTO(Long examen_id,  Long  totalExameneSustinute) {
        this.examen_id = examen_id;
        this.totalExameneSustinute = totalExameneSustinute;
    }
}
