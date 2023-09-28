package com.markme.api.v1.serviceImpls;

import com.markme.api.v1.models.Student;
import com.markme.api.v1.services.IStudentService;

import java.util.List;
import java.util.UUID;

public class StudentServiceImpl implements IStudentService {
    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(UUID id, Student student) {
        return null;
    }

    @Override
    public Student getStudentById(UUID id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void deleteStudentById(UUID id) {

    }
}
