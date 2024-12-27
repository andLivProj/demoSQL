package org.example.repository;

import org.example.DTO.IntrebariDTO;
import org.example.model.Intrebari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IntrebariRpository extends JpaRepository<Intrebari, Long> {


//    @Query(value = "SELECT i FROM Intrebari i WHERE i.examen_id = :examenId")
//    List<Intrebari> findByExamenId(@Param("examenId") int examenId);
//

    @Query("SELECT new org.example.DTO.IntrebariDTO(i.intrebare) FROM Intrebari i")
    List<IntrebariDTO> getAllIntrebari();

}
