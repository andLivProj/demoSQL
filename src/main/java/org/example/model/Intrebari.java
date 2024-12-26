package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "intrebari")
@Data
public class Intrebari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String intrebare;

    @ManyToOne
    @JoinColumn(name = "examen_id")
    private Examene examen_id;
}