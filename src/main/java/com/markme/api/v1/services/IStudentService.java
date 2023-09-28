package com.markme.api.v1.services;

import com.markme.api.v1.dtos.UpdateUserDTO;
import com.markme.api.v1.models.Student;

import java.util.List;
import java.util.UUID;

public interface IStudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    List<Student> createMultipleStudents(List<Student> students);

}
