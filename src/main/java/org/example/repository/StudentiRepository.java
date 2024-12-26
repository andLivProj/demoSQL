package org.example.repository;

import org.example.model.Studenti;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentiRepository extends JpaRepository<Studenti, String> {
}
