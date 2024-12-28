package org.example.DTO;

import lombok.Data;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
public class IntrebariDTO {
    private String intrebare;
    private String tipExamen;
    private int totalIntrebari;
    private String dateExamen;

    public IntrebariDTO(String intrebare) {
        this.intrebare = intrebare;
    }

    public IntrebariDTO(String tipExamen, String intrebare, int totalIntrebari, Date dateExamen) {
        this.intrebare = intrebare;
        this.tipExamen = tipExamen;
        this.totalIntrebari = totalIntrebari;
        LocalDate localDate = dateExamen.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dateExamen = localDate.format(formatter);
    }

}
