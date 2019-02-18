package com.a2j.course;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	final static Logger logger = Logger.getLogger(CourseController.class);
	@Autowired
	private CourseService courseService;

	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public String Course(@RequestParam String name, ModelMap model) {
//		logger.debug("todo servelet doGet methode is executed");
		logger.error("i am a error");

//		request.setAttribute("courses", CourseService.retriveTodos());
		model.addAttribute("name", name);
		model.addAttribute("courses", courseService.retriveCourses());
//		request.getRequestDispatcher("/WEB-INF/views/course.jsp").forward(request, response);

		return "course";
	}
}
