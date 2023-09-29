package com.sena.senasoft.controller;


import com.sena.senasoft.domain.user.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@SecurityRequirement(name = "bearer-key")
@Tag(name = "User", description = "User methods {GET ALL, GET, PUT, DELETE")
public class UserController {

    private final IUserService userService;


    @GetMapping
    @Operation(
            summary = "Get all users",
            description = "",
            tags = {"Consult", "GET"}
    )
    public ResponseEntity<List<UserListDto>> getUserList(){
        return ResponseEntity.ok(userService.getUserList());
    }


    @Operation(
            summary = "Create a user",
            description = "",
            tags = {"GET"}
    )
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDataDto> getUser(@PathVariable Long id){
        User user = userService.getUser(id);
        return ResponseEntity.ok(new UserResponseDataDto(user));
    }



    @Operation(
            summary = "Update a user",
            description = "",
            tags = {"PUT"}
    )
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDataDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserUpdateDto updatedDto
    ){
        UserResponseDataDto userResponse =userService.update(id, updatedDto);
        return ResponseEntity.ok(userResponse);
    }


    @DeleteMapping("/{id}")
    @Operation(
            summary = "Delete a user",
            description = "",
            tags = {"DELETE"}
    )
    public ResponseEntity deleteUser(
            @PathVariable Long id
    ){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
