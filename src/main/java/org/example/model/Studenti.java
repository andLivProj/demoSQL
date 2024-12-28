package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "studenti")
@Data
public class Studenti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nume;

    @Column(length = 100)
    private String prenume;

    @Column(length = 100, unique = true)
    private String email;

    private Boolean sustinutExamen;

    @OneToMany(mappedBy = "student_id", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Inscrieri> inscriereStudenti;

}