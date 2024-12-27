package org.example.DTO;

import lombok.Data;
import org.example.model.Examene;
import org.example.model.Inscrieri;
import org.example.model.Intrebari;
import org.example.model.Studenti;

@Data
public class RaspunsuriDTO {

    private String raspunsCorect;
    private String varA;
    private String varB;

    public RaspunsuriDTO(String raspunsCorect, String varA, String varB) {
        this.raspunsCorect = raspunsCorect;
        this.varA = varA;
        this.varB = varB;
    }
}
