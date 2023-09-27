package com.sena.senasoft.controller;


import com.sena.senasoft.domain.user.User;
import com.sena.senasoft.domain.user.UserAuthenticationDto;
import com.sena.senasoft.infra.security.DataJWTToken;
import com.sena.senasoft.infra.security.TokenService;
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
/**
 *
 *
@Tag(name = "Autenticacion",
        description = "obtiene el token para el usuario asignado que da acceso al resto de endpoint")
@CrossOrigin(origins = "*")
*/
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;


    private final TokenService tokenService;

    /**
     * This method allows the user go to authenticate in the API
     * with his user and password
     * @param dataAuthenticateUser
     * @return
     */
    @PostMapping
    public ResponseEntity authenticateUser(
            @RequestBody @Valid UserAuthenticationDto dataAuthenticateUser
    ) {

        Authentication authToken =
                new UsernamePasswordAuthenticationToken(
                        dataAuthenticateUser.email(),
                        dataAuthenticateUser.password()
                );

        var authenticateUser = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generateToken((User) authenticateUser.getPrincipal());
        return ResponseEntity.ok(new DataJWTToken(JWTtoken));
    }

}