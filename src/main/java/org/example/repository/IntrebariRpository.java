package org.example.repository;

import org.example.model.Intrebari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IntrebariRpository extends JpaRepository<Intrebari, String> {


    @Query("SELECT i FROM Intrebari i WHERE i.examen_id = :examenId")
    List<Intrebari> findByExamenId(@Param("examenId") int examenId);

    @Query("SELECT count(i) FROM Intrebari i where i.examen_id = :examenId ")
    Integer countByExamen(@Param("examenId") int examenId);

}
