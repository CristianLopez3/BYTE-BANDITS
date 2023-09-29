package com.sena.senasoft.domain.user;

import com.sena.senasoft.domain.user.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.util.Date;

public record UserRegisterDataDto(

        String name,

        String email,
        String password,
        String education,
        Date birthDate,
        String city,
        String interest,
        Role role
) {


}
