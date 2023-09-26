package com.sena.senasoft.domain;

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
