package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "raspunsuri")
@Data
public class Raspunsuri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String varA;

    @Column(length = 1000)
    private String varB;

    @Column(length = 1)
    private String raspunsCorect;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intrebare_id")
    private Intrebari intrebare_id;

}