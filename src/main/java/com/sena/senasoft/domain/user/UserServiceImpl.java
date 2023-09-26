package com.sena.senasoft.domain.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

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
    public List<UserListDto> getUserList() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserListDto::new).collect(Collectors.toList());
    }




}
