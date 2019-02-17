package com.a2j.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	@RequestMapping(value = "/course")
	public String Course() {
		return "course";
	}
}
