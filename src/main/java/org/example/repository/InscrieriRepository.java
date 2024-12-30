package org.example.repository;

import org.example.DTO.InscrieriDTO;
import org.example.model.Inscrieri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InscrieriRepository extends JpaRepository<Inscrieri, Long> {

    @Query("SELECT new org.example.DTO.InscrieriDTO(ex.id, ex.examen, ins.nota) " +
            "FROM Inscrieri ins Join ins.examen_id ex" )
    List<InscrieriDTO> getExamsAndGrades ();

    @Query("SELECT new org.example.DTO.InscrieriDTO(ex.id, COUNT(i.nota)) " +
            "FROM Inscrieri i " +
            "JOIN i.examen_id ex " +
            "GROUP BY ex.id " +
            "ORDER BY ex.id")
    List<InscrieriDTO> getPromoPerExamen();
}
