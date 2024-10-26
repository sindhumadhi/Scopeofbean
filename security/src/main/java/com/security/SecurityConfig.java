package com.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.security.auth.message.config.AuthConfig;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
@Bean
public UserDetailsService UserDetailsService (PasswordEncoder pass) {
	UserDetails admin=User.withUsername("sindhu").password("$2a$12$PBH5cICXvF.apfyUF56z2O5evSa5sQ6sX6q34u3qwDYFyyi.U/XOe").roles("ADMIN","USER").build();
	UserDetails user=User.withUsername("nandhu").password("$2a$12$O.z3MI5RtMqZ9T0c4ahJzepTGcNn15RRaDxCbuHhgGFpc3ilpr/TC").roles("USER","ADMIN").build();
	return  new InMemoryUserDetailsManager(admin,user);
	
}
public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
	http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth.requestMatchers("/user").hasAnyRole("USER","ADMIN").requestMatchers("/admin").hasRole("ADMIN"));
	return http.build();
}
@Bean
public PasswordEncoder getPassword () {
	return  new BCryptPasswordEncoder(12);
}
}
