package com.sena.senasoft.domain.user;

import com.sena.senasoft.domain.user.UserListDto;
import com.sena.senasoft.domain.user.UserRegisterDataDto;
import com.sena.senasoft.domain.user.UserResponseDataDto;
import com.sena.senasoft.domain.user.UserUpdateDto;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IUserService {

    UserResponseDataDto saveUser(UserRegisterDataDto userDto);

    UserResponseDataDto update(Long id, UserUpdateDto userUpdateDto);

    void deleteUser(Long id);

    User getUser(Long id);

    List<UserListDto> getUserList();
}
