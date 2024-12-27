package org.example.repository;

import org.example.DTO.ExameneDTO;
import org.example.DTO.StudentiDTO;
import org.example.model.Studenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentiRepository extends JpaRepository<Studenti, Long> {

    @Query("SELECT new org.example.DTO.StudentiDTO(s.nume, s.prenume, s.email) FROM Studenti s")
    List<StudentiDTO> getAllStudents();
}
