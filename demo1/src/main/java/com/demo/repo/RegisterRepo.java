package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Register;
@Repository 
public interface RegisterRepo extends JpaRepository<Register, Integer> {
	
	Register findByUsername(String username);
}
 