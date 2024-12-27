package org.example.controllers;

import org.example.DTO.ExameneDTO;
import org.example.model.Examene;
import org.example.services.ExameneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExameneController {

    private final ExameneService exameneService;

    public ExameneController(ExameneService exameneService) {
        this.exameneService = exameneService;
    }

    @GetMapping("toateExamenele")
    public List<ExameneDTO> getAllExamenes() {
        return exameneService.getAllExamene();
    }
}
