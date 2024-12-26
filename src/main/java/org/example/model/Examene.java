package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "examene")
@Data
public class Examene {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String examen;

    @Column(name="data_examen")
    private Date dataExamen;

    @Column(name = "total_intrebari")
    private int totalIntrebari;

    @OneToMany(mappedBy = "examen_id",orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Inscrieri> inscrieriExamene;

    @OneToMany(mappedBy = "examen_id",orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Intrebari> intrebariExamene;
}