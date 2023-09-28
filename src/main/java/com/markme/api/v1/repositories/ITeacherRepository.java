package com.markme.api.v1.repositories;

import com.markme.api.v1.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITeacherRepository extends JpaRepository<Teacher, UUID> {
}
