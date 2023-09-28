package com.markme.api.v1.services;

import com.markme.api.v1.models.Student;

import java.util.List;
import java.util.UUID;

public interface IStudentService {

    Student saveStudent(Student student);

    Student updateStudent(UUID id, Student student);

    Student getStudentById(UUID id);

    List<Student> getAllStudents();

    void deleteStudentById(UUID id);

}
