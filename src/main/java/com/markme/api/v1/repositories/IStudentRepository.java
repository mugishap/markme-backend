package com.markme.api.v1.repositories;

import com.markme.api.v1.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IStudentRepository extends JpaRepository<Student, UUID> {
}
