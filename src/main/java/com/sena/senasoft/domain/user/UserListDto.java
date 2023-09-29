package com.sena.senasoft.domain.user;

public record UserListDto(
        String name,
        String email,
        String education,
        String city
) {

    public UserListDto(User user){
        this(user.getName(), user.getEmail(), user.getEducation(), user.getCity());
    }

}
