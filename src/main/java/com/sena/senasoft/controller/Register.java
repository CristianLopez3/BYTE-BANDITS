package com.sena.senasoft.controller;


import com.sena.senasoft.domain.user.IUserService;
import com.sena.senasoft.domain.user.UserRegisterDataDto;
import com.sena.senasoft.domain.user.UserResponseDataDto;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
@RequiredArgsConstructor
public class Register {

    private final IUserService userService;


    @Operation(
            summary = "Save a user in the database",
            description = "",
            tags = {"POST"}
    )
    @PostMapping("/")
    public ResponseEntity<UserResponseDataDto> saveUser(@RequestBody @Valid UserRegisterDataDto registerData){
        if(registerData == null){
            throw new IllegalArgumentException("register data is null");
        }
        return ResponseEntity.ok(userService.saveUser(registerData));
    }

}
