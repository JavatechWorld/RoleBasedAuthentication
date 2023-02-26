package com.role.implementation.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.role.implementation.DTO.UserRegisteredDTO;
import com.role.implementation.model.User;


public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);
	
}
