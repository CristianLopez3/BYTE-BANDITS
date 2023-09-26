package com.sena.senasoft.domain.user;

import java.util.Date;

public record UserResponseDataDto(
        Long id,
        String name,
        String email,
        Role role,
        String education,
        Date birthDate
) {

    public UserResponseDataDto(User user){
        this(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole(),
                user.getEducation(),
                user.getBirthDate()
        );
    }

}
