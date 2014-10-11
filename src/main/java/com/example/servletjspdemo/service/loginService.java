package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.user;

public class loginService{
	
	private List<user> db = new ArrayList<user>();
	
	loginService(){
		user newUser1 = new user("jkowalski", "1234");
		db.add(newUser1);
		user newUser2 = new user("amalinowski", "4321");
		db.add(newUser2);
		user newUser3 = new user("rraczek","1234567890");
		db.add(newUser3);
	}
	
	public boolean check(user user){
		for (int i = 0; i<db.size();i++) {
			if (user.login.equals(db.get(i).login)) {
				if (user.password.equals(db.get(i).password)) {
					return true;
				} else return false;
			} else return false;
		}
		return false;
	}
	
}