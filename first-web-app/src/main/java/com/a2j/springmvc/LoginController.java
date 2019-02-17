package com.a2j.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	// @ResponseBody
	public String sayHello() {
		return "login";
	}
}
