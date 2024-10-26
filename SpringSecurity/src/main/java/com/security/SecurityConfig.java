package com.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		
		auth.inMemoryAuthentication().withUser("sindhumadhi").password("$2a$12$hyDcl9W.Pq2xP7UVWK0zUu.u7rrSUTEV16Qv9BNsnYPtA/5KDw3EG").roles("student").
		and().withUser("nisha").password("$2a$12$6F.WRtx8T3WTIh8ECf8IGucUlT.YBujrUTEaPBxsPMR7A/pP34n5i").roles("trainer").and().withUser("priya").password("$2a$12$n4g.0Bs6IlIbbPrLHqkSru4SylfP/hjKU6zNgSTwVDfjgUAb1pQ42").roles("manager");
	}
	
	/*
	@Bean 
	public PasswordEncoder getPassword()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	*/
	
	@Bean
	public PasswordEncoder getPassword()
	{
		return new BCryptPasswordEncoder(12);
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/getManager").hasRole("manager");
		http.authorizeRequests().antMatchers("/getTrainer").hasAnyRole("trainer","manager");
		http.authorizeRequests().antMatchers("/getStudent").permitAll().and().formLogin();	
	}
}
