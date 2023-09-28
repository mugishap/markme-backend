package com.markme.api.v1.serviceImpls;

import com.markme.api.v1.dtos.UpdateUserDTO;
import com.markme.api.v1.models.Teacher;
import com.markme.api.v1.repositories.ITeacherRepository;
import com.markme.api.v1.services.ITeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements ITeacherService {
    private final ITeacherRepository teacherRepository;

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return this.teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return this.teacherRepository.findAll();
    }
}
