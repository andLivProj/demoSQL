package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "inscrieri")
@Data
public class Inscrieri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Studenti student_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "examen_id")
    private Examene examen_id;
}