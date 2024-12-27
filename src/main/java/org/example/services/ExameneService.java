package org.example.services;

import org.example.DTO.ExameneDTO;
import org.example.repository.ExameneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExameneService {

    private final ExameneRepository exameneRepository;

    public ExameneService(ExameneRepository exameneRepository) {
        this.exameneRepository = exameneRepository;
    }

    public List<ExameneDTO> getAllExamene() {
        return exameneRepository.getAllExamene();
    }
}
