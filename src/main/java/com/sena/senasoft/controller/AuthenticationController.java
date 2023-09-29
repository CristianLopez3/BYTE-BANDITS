package com.sena.senasoft.controller;


import com.sena.senasoft.domain.user.User;
import com.sena.senasoft.domain.user.UserAuthenticationDto;
import com.sena.senasoft.domain.user.UserRepository;
import com.sena.senasoft.infra.security.DataJWTToken;
import com.sena.senasoft.infra.security.TokenService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
@Tag(name = "Authentication",
        description = "Retrieves the token for the assigned user, granting access to the remaining endpoints.")
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;

    private final UserRepository userRepository;
    private final TokenService tokenService;


    @Operation(
            summary = "generated jwt token",
            description = "This method allows the user go to authenticate in the API with his user and password",
            responses = {
                    @ApiResponse ( description = "Success", responseCode = "200"),
                    @ApiResponse ( description = "Invalid token", responseCode = "403")
            }
    )
    @PostMapping("/")
    public ResponseEntity authenticateUser(
            @RequestBody @Valid UserAuthenticationDto dataAuthenticateUser
    ) {
        User user = userRepository.findUser(dataAuthenticateUser.email()).get();
        Authentication authToken =
                new UsernamePasswordAuthenticationToken(
                        dataAuthenticateUser.email(),
                        dataAuthenticateUser.password()
                );

        var authenticateUser = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generateToken((User) authenticateUser.getPrincipal());
        return ResponseEntity.ok(new DataJWTToken(JWTtoken, user.getId(), user.getRole()));
    }

}