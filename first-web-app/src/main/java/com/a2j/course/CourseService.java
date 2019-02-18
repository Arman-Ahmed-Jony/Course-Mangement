package com.a2j.course;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	final static Logger logger = Logger.getLogger(CourseService.class);
	private static List<Course> courses = new ArrayList<Course>();
	static {
		courses.add(new Course("learn web Application", "500"));
		courses.add(new Course("learn Spring MVC", "500"));
		courses.add(new Course("learn Spring rest service", "500"));
		courses.add(new Course("jsp servlet", "500"));
	}

	public List<Course> retriveCourses() {
		logger.debug(courses);
		return courses;
	}

	public void addTodos(String name, String price) {
		Course newTodo = new Course(name, price);
		courses.add(newTodo);
		logger.debug(name + " " + "elements are added");
	}

	public void deleteTodos(Course course) {
		courses.remove(course);
		logger.debug(course + " " + "elements are deleted");
	}

}
