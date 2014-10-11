package com.example.servletjspdemo.domain;

public class user {
	
	public String login = "unknown";
	public String password = "";
	
	public user() {
		super();
	}
	
	public user(String log, String pass) {
		super();
		this.login = log;
		this.password = pass;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String log) {
		this.login = log;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String pass) {
		this.password = pass;
	}
}