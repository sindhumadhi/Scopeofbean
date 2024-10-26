package com.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecurityController 
{
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public String getUser()
	{
		return "THIS IS USER PAGE";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String getAdmin()
	{
		return "THIS IS ADMIN PAGE";
	}

}
