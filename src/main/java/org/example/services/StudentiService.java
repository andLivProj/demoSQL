package org.example.services;

import org.example.DTO.StudentiDTO;
import org.example.repository.StudentiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentiService {

    private final StudentiRepository studentiRepository;

    public StudentiService(StudentiRepository studentiRepository) {
        this.studentiRepository = studentiRepository;
    }

    public List<StudentiDTO> getAllStudenti() {
        return studentiRepository.getAllStudents();
    }
}
