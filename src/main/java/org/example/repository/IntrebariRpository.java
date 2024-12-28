package org.example.repository;

import org.example.DTO.IntrebariDTO;
import org.example.model.Intrebari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IntrebariRpository extends JpaRepository<Intrebari, Long> {


    @Query("SELECT new org.example.DTO.IntrebariDTO (e.examen, i.intrebare, e.totalIntrebari, e.dataExamen)" +
                    "FROM Intrebari i " +
                    "join i.examen_id e " +
                    "WHERE e.id = :examenId")
    List<IntrebariDTO> findByExamenId(@Param("examenId") Long examenId);


    @Query("SELECT new org.example.DTO.IntrebariDTO(i.intrebare) FROM Intrebari i")
    List<IntrebariDTO> getAllIntrebari();

}
