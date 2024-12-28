package org.example.services;

import org.example.DTO.StudentiDTO;
import org.example.repository.StudentiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentiService {

    private final StudentiRepository studentiRepository;

    public StudentiService(StudentiRepository studentiRepository) {
        this.studentiRepository = studentiRepository;
    }

    public List<String> getAllStudenti() {
        return studentiRepository.getAllStudents().stream()
                .map(studentiDTO -> studentiDTO.getNume() + " " + studentiDTO.getPrenume()).collect(Collectors.toList());
    }

    public List<StudentiDTO> getAllStudentiTestati() {
        return studentiRepository.getAllTestedStudents();
    }

    public List<StudentiDTO> getAllStudentiCerinta() {
        return studentiRepository.getAllStudentiCerinta();
    }

}
