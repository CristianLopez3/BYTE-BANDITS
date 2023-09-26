package com.sena.senasoft.domain;

import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface IUserService {

    UserResponseDataDto saveUser(UserRegisterDataDto userDto);

    UserResponseDataDto updateUser(UserUpdateDto userUpdateDto);

    Page<UserListDto> getUserList(Pageable pagination);

}
