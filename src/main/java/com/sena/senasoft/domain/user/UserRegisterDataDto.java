package com.sena.senasoft.domain.user;

import com.sena.senasoft.domain.user.Role;

import java.math.BigInteger;
import java.util.Date;

public record UserRegisterDataDto(
        String name,
        String email,
        String password,
        String education,
        Date birthDate,
        String city,
        String interest,
        BigInteger score,
        Role role
) {


}
