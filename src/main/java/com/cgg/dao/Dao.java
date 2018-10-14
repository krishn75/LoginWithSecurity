package com.cgg.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cgg.entity.Users;

@Repository
public interface Dao extends CrudRepository<Users, Integer> {

	Users findByUsername(String un);
	
}
