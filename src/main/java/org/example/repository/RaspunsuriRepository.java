package org.example.repository;

import org.example.DTO.IntrebariDTO;
import org.example.DTO.RaspunsuriDTO;
import org.example.model.Raspunsuri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RaspunsuriRepository extends JpaRepository<Raspunsuri, Long> {

    @Query("SELECT new org.example.DTO.RaspunsuriDTO(r.raspunsCorect, r.varA, r.varB) " +
            "FROM Raspunsuri r")
    List<RaspunsuriDTO> getAllRaspunsuri();
}
