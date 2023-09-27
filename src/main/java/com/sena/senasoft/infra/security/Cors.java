package com.sena.senasoft.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class Cors {

    @Bean
    public CorsFilter corsFilter() {
        // Configure the rules for the cors filter
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // Permite solicitudes de cualquier origen
        corsConfiguration.addAllowedMethod("*"); // Permite cualquier método (GET, POST, PUT, DELETE, etc.)
        corsConfiguration.addAllowedHeader("*"); // Permite cualquier encabezado

        // Apply the configuration for the all routes
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        // return the CORS filter configured
        return new CorsFilter(source);
    }
}

