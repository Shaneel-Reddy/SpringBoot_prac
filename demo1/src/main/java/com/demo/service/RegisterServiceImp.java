package com.demo.service;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
 
import com.demo.entity.Register;

import com.demo.repo.RegisterRepo;
 
@Service

public class RegisterServiceImp implements RegisterService {
 
	@Autowired private RegisterRepo repo;

	@Override

	public Register saveNewUser(Register register) {

		return repo.save(register);

	}
 
	@Override
	public Register login(String username,String password) {
		
		 Register register = repo.findByUsername(username);
	        
	        if (register != null && register.getPassword().equals(password)) {
	            return register; 
	        } else {
	            return null;
	        }
	}
 
}
