package org.example.repository;

import org.example.DTO.RaspunsuriDTO;
import org.example.model.Raspunsuri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RaspunsuriRepository extends JpaRepository<Raspunsuri, Long> {

    @Query("SELECT new org.example.DTO.RaspunsuriDTO(r.id, i.intrebare, r.raspunsCorect, r.varA, r.varB,i.id) " +
            "FROM Raspunsuri r Join r.intrebare_id i" )
    List<RaspunsuriDTO> getAllRaspunsuri();

}
