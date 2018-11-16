package com.a2j.course.servlet;
/*
 * this is a Login servlet.
 * 1. we are using @WebServlet anotation where we can use urlPatterns to set a url pattern to execute this servlet
 * 2. doGet method is used to Handle any get request from the browser from the client.
 * 3. doGet method takes two parameters. HttpServletRequest is the input request. & HttpServletResponse is the output of the request
 * 4. request comes with some parameters. like		http://localhost:9966/login.do?name=arman ahmed jony&password=amarPassword
 * 5. we use request.getparameter("parameter name")
 *  
 * 
 * */


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.a2j.course.*;
import com.a2j.login.LoginService;

@WebServlet(urlPatterns = "/deleteCourse.do")
public class deleteCourse extends HttpServlet {
	final static Logger logger = Logger.getLogger(deleteCourse.class);

	private CourseService CourseService = new CourseService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// logs a debug message
		logger.debug("deleteCourse servelet doGet methode is executed");
		CourseService.deleteTodos(new Course(request.getParameter("name"),request.getParameter("price")));
		response.sendRedirect("/course.do");
	}


}