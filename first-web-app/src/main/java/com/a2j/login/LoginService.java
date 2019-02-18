package com.a2j.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isUserValid(String UserID, String UserPass) {
		if (UserID.equals("Arman") && UserPass.equals("123"))
			return true;
		return false;
	}
}
