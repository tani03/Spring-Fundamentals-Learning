package com.learn.service;

public class LoginService {
	
	public boolean checkName(String userName) {
		boolean ret=false;
		if(userName.equals("taniya")) {
			ret=true;
		}
		
		return ret;
	}
	public boolean checkpassword(String password) {
		boolean ret=false;
		
		if(password.equals("taniya")) {
			ret=true;
		}
		return ret;
	}

}
