package org.example.DTO;

import lombok.Data;

@Data
public class IntrebariDTO {
    private String intrebare;

    private int examen_id;

    public IntrebariDTO(String intrebare) {
        this.intrebare = intrebare;
    }

}
