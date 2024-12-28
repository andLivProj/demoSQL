package org.example.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ExameneDTO {

    private String examen;
    private Date dataExamen;
    private int totalIntrebari;

    public ExameneDTO(String examen, Date dataExamen, int totalIntrebari) {
        this.examen = examen;
        this.dataExamen = dataExamen;
        this.totalIntrebari = totalIntrebari;
    }


}
