package com.supportportal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class RestConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.setAllowedHeaders(Arrays.asList("Origin", "Access-Control=Allow-Origin",
                "Content-Type", "Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        config.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token",
                "Authorization", "Access-Control-Allow-Origin", "Access-Control-Allow-Credential"));
        config.setAllowedMethods(Arrays.asList("OPTIONS", "GET", "POST", "PUT", "DELETE"));
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
