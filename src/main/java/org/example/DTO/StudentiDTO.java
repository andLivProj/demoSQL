package org.example.DTO;

import lombok.Data;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
public class StudentiDTO {

    private String nume;
    private String prenume;
    private String fullName;
    private String email;
    private String examen;
    private String dateExamen;
    private Boolean sustinutExamen;
    private Integer totalIntrebari;
    private Integer notaExamen;

    public StudentiDTO(String nume, String prenume, String email, String examen, Date dateExamen, Boolean sustinutExamen) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.examen = examen;
        LocalDate localDate = dateExamen.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dateExamen = localDate.format(formatter);
        this.sustinutExamen = sustinutExamen;
    }

    public StudentiDTO(String nume, String prenume, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
    }

    public StudentiDTO(String nume, String prenume, String email, String examen, Date dateExamen, Boolean sustinutExamen, Integer totalIntrebari, Integer notaExamen) {
        this.fullName = nume + " " + prenume;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.examen = examen;
        LocalDate localDate = dateExamen.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dateExamen = localDate.format(formatter);
        this.sustinutExamen = sustinutExamen;
        this.totalIntrebari = totalIntrebari;
        this.notaExamen = notaExamen;
    }

}

