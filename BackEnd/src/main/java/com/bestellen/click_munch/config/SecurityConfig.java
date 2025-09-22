package com.bestellen.click_munch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    InMemoryUserDetailsManager userCreation(){
        return new InMemoryUserDetailsManager(
                User.withUsername("Mike")
                        .password("{noop}test")
                        .roles("USER")
                        .build()
        );
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .anyRequest().permitAll()
                )
                .formLogin(Customizer.withDefaults())
                .build();
    }



}
*/