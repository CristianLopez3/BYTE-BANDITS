package com.sena.senasoft.domain.user;

import java.math.BigInteger;
import java.util.Date;

public record UserResponseDataDto(
        Long id,
        String name,
        String email,
        Role role,
        BigInteger score,
        String education,
        String interest,
        Date birthDate
) {

    public UserResponseDataDto(User user){
        this(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole(),
                user.getScore(),
                user.getEducation(),
                user.getInterest(),
                user.getBirthDate()
        );
    }

}
