package com.markme.api.v1.dtos;

import com.markme.api.v1.enums.EGender;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
public class UpdateUserDTO {
    @Email
    private String email;

    @NotBlank
    private String names;

    @Pattern(regexp = "[0-9]{12}")
    private String telephone;


    private EGender gender;

}