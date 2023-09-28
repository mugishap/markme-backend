package com.markme.api.v1.serviceImpls;

import com.markme.api.v1.models.Student;
import com.markme.api.v1.repositories.IStudentRepository;
import com.markme.api.v1.services.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return this.studentRepository.save(student);
    }


    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public List<Student> createMultipleStudents(List<Student> students) {
        return this.studentRepository.saveAll(students);
    }

}
