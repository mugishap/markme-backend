package com.markme.api.v1.dtos;

import lombok.Data;

import java.util.List;

@Data
public class MultipleStudentsDTO {

    private List<SignUpDTO> studentsDTO;

}
