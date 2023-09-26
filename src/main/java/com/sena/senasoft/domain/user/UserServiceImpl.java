package com.sena.senasoft.domain;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{

    private final UserRepository userRepository;

    @Override
    public UserResponseDataDto saveUser(UserRegisterDataDto userDto) {
        User user = new User();

        user.setName(userDto.name());
        user.setEducation(userDto.education());
        user.setEmail(userDto.email());
        user.setPassword(userDto.password());
        user.setRole(userDto.role());
        user.setBirthDate(userDto.birthDate());
        user.setCity(userDto.city());
        userRepository.save(user);
        return new UserResponseDataDto(user);
    }

    @Override
    public UserResponseDataDto updateUser(UserUpdateDto userUpdateDto) {
        return null;
    }

    @Override
    public Page<UserListDto> getUserList(Pageable pagination) {
        return null;
    }



}
