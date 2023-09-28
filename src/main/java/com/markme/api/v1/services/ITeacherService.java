package com.markme.api.v1.services;

import com.markme.api.v1.dtos.UpdateUserDTO;
import com.markme.api.v1.models.Teacher;

import java.util.List;
import java.util.UUID;

public interface ITeacherService {

    Teacher createTeacher(Teacher teacher);

    Teacher getTeacherById(UUID id);

    Teacher updateTeacher(UUID id, UpdateUserDTO dto);

    void deleteTeacher(UUID id);

    List<Teacher> getAllTeachers();

}
