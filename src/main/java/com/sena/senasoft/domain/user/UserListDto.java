package com.sena.senasoft.domain.user;

import java.math.BigInteger;

public record UserListDto(
        String name,
        String email,
        String education,
        String city,
        BigInteger score
) {

    public UserListDto(User user){
        this(user.getName(), user.getEmail(), user.getEducation(), user.getCity(), user.getScore());
    }

}
