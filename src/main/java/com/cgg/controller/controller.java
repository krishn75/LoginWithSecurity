package com.cgg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgg.dao.Dao;
import com.cgg.entity.Users;

@Controller
public class controller {
	@Autowired
	private Dao d;
	
	@Autowired
	private BCryptPasswordEncoder bc;
	
	@RequestMapping("/reg")
	public String register() {
		/*Users u=new Users();
		u.setUsername("krishna");
		u.setPass(bc.encode("krishna"));
		d.save(u);*/
		System.out.println("helooooooooooooooooooooooooooooooooooooooooooooooooooo");
		
		return "success";
	}

}
