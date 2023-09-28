package com.sena.senasoft.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class Cors {

    @Bean
    public CorsFilter corsFilter() {
        // Configure the rules for the cors filter
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Configura las URLs permitidas para las solicitudes CORS
        config.addAllowedOrigin("*"); // Aquí puedes configurar los dominios permitidos, ej. "http://127.0.0.1:5500"
        config.addAllowedHeader("*"); // Puedes configurar los encabezados permitidos
        config.addAllowedHeader("Access-Control-Allow-Origin: *"); // Puedes configurar los encabezados permitidos
        config.addAllowedMethod("*"); // Puedes configurar los métodos HTTP permitidos

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }



}

