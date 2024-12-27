package org.example.repository;

import org.example.DTO.ExameneDTO;
import org.example.DTO.IntrebariDTO;
import org.example.model.Examene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExameneRepository extends JpaRepository<Examene, Long> {


    @Query("SELECT new org.example.DTO.ExameneDTO(e.examen, e.dataExamen, e.totalIntrebari) FROM Examene e")
    List<ExameneDTO> getAllExamene();
}
