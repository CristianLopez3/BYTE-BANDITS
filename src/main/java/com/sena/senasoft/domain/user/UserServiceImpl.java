package com.sena.senasoft.domain.user;


import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserResponseDataDto saveUser(UserRegisterDataDto userDto) {
        User user = new User();
        user.setName(userDto.name());
        user.setEducation(userDto.education());
        user.setEmail(userDto.email());
        user.setPassword(passwordEncoder.encode(userDto.password())); // encrypt password
        user.setRole(userDto.role());
        user.setBirthDate(userDto.birthDate());
        user.setCity(userDto.city());
        user.setInterest(userDto.interest());
        userRepository.save(user);
        return new UserResponseDataDto(user);

    }

    @Override
    public UserResponseDataDto update(Long id, UserUpdateDto userUpdateDto) {
        if(userUpdateDto == null){
            throw new IllegalArgumentException("User update data is null");
        }

        User user = getUser(id);
        user.setName(userUpdateDto.name());
        user.setEducation(userUpdateDto.education());
        user.setPassword(passwordEncoder.encode(userUpdateDto.password())); // encrypt password
        user.setCity(userUpdateDto.city());
        user.setCity(userUpdateDto.interest());
        userRepository.save(user);
        return new UserResponseDataDto(user);
    }

    @Override
    public void deleteUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            userRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("User not found");
        }
    }

    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new EntityNotFoundException("User not found");
        }

        User realUser = user.get();
        return user.get();
    }

    @Override
    public List<UserListDto> getUserList() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserListDto::new).collect(Collectors.toList());
    }




}
