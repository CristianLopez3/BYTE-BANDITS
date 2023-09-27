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

    private final UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<UserResponseDataDto> saveUser( @RequestBody UserRegisterDataDto registerData){
        return ResponseEntity.ok(userService.saveUser(registerData));
    }

    @GetMapping
    public ResponseEntity<List<UserListDto>> getUserList(){
        return ResponseEntity.ok(userService.getUserList());
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDataDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserUpdateDto updatedDto
    ){
        UserResponseDataDto userResponse =userService.update(id, updatedDto);
        return ResponseEntity.ok(userResponse);
    }
}
