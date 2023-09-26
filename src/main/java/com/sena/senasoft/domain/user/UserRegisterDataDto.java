package com.sena.senasoft.domain.user;

import com.sena.senasoft.domain.user.Role;

import java.util.Date;

public record UserRegisterDataDto(
        String name,
        String email,
        String password,
        String education,
        Date birthDate,
        String city,
        Role role
) {


}
