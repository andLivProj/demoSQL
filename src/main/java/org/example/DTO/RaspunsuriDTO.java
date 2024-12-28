package org.example.DTO;

import lombok.Data;

@Data
public class RaspunsuriDTO {
    private long id;
    private String raspunsCorect;
    private String varA;
    private String varB;
    private Long intrebareId; // Only the ID of the question
    private String intrebareText; // The text of the question


    public RaspunsuriDTO(long id, String intrebareText, String raspunsCorect, String varA, String varB, Long intrebareId) {
        this.id = id;
        this.raspunsCorect = raspunsCorect;
        this.varA = varA;
        this.varB = varB;
        this.intrebareId = intrebareId;
        this.intrebareText = intrebareText;
    }

}
