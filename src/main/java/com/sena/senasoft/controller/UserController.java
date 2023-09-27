package com.sena.senasoft.controller;


import com.sena.senasoft.domain.user.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    /**
     * Save a user in the database
     * @param registerData {name, email, password, birthDate, education, rol, devrole}
     * @return
     */
    @PostMapping
    public ResponseEntity<UserResponseDataDto> saveUser( @RequestBody UserRegisterDataDto registerData){
        return ResponseEntity.ok(userService.saveUser(registerData));
    }

    /**
     * @return All users
     */
    @GetMapping
    public ResponseEntity<List<UserListDto>> getUserList(){
        return ResponseEntity.ok(userService.getUserList());
    }

    /**
     *
     * @param id
     * @return a user
     */
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDataDto> getUser(@PathVariable Long id){
        User user = userService.getUser(id);
        return ResponseEntity.ok(new UserResponseDataDto(user));
    }


    /**
     * Update the user data
     * @param id
     * @param updatedDto: {name, password, education}
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDataDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserUpdateDto updatedDto
    ){
        UserResponseDataDto userResponse =userService.update(id, updatedDto);
        return ResponseEntity.ok(userResponse);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(
            @PathVariable Long id
    ){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
