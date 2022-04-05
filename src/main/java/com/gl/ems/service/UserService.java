package com.gl.ems.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.ems.dto.UserRegistrationDto;
import com.gl.ems.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
