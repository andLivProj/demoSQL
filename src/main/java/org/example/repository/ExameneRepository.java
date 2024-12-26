package org.example.repository;

import org.example.model.Examene;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExameneRepository extends JpaRepository<Examene, String> {
}
