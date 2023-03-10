package com.matheus.peoplemanager.repository;

import com.matheus.peoplemanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
