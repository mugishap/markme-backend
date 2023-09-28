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
    public Teacher getTeacherById(UUID id) {
        return this.teacherRepository.getById(id);
    }

    @Override
    public Teacher updateTeacher(UUID id, UpdateUserDTO dto) {
        Teacher teacher = this.teacherRepository.getById(id);
        teacher.setNames(dto.getNames());
        teacher.setEmail(dto.getEmail());
        teacher.setGender(dto.getGender());
        teacher.setTelephone(dto.getTelephone());
        return this.teacherRepository.save(teacher);
    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteTeacher(UUID id) {
        this.teacherRepository.deleteById(id);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return this.teacherRepository.findAll();
    }
}
