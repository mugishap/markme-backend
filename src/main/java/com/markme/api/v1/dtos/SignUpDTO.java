package com.markme.api.v1.dtos;


import com.markme.api.v1.enums.EGender;
import com.markme.api.v1.enums.ERole;
import com.markme.api.v1.security.ValidPassword;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
public class SignUpDTO {

    @Email
    private  String email;

    @NotBlank
    private  String names;

    @NotBlank
    private  String telephone;

    private EGender gender;

    private ERole role;

    @ValidPassword
    private  String password;
}
