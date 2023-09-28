package com.markme.api.v1.services;

import com.markme.api.v1.dtos.UpdateUserDTO;
import com.markme.api.v1.models.Teacher;

import java.util.List;
import java.util.UUID;

public interface ITeacherService {

    Teacher createTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();

}
