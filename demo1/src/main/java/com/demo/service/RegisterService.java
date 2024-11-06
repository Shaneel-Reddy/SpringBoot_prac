package com.demo.service;

import com.demo.entity.Register;

public interface RegisterService {

    Register saveNewUser(Register register);

    Register login(String username, String password);

	
}
