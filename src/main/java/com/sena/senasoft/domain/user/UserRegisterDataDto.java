package com.sena.senasoft.domain.user;

import com.sena.senasoft.domain.user.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.util.Date;

public record UserRegisterDataDto(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String password,
        @NotBlank
        String education,
        @NotBlank
        @Past
        Date birthDate,
        @NotBlank
        String city,
        @NotBlank
        String interest,
        @NotNull
        Role role
) {


}
