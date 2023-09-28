package com.sena.senasoft.infra.security;

import com.sena.senasoft.domain.user.Role;

public record DataJWTToken(String jwTtoken, Long id, Role role) {
}
