package org.example.DTO;

import lombok.Data;

@Data
public class StudentiDTO {

    private String nume;

    private String prenume;

    private String email;

    public StudentiDTO(String nume, String prenume, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
    }
}
