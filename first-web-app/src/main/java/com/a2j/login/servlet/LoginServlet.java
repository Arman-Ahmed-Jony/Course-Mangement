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

package com.a2j.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.a2j.login.LoginService;

//url pattern is removed as spring mvc is used
//@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	final static Logger logger = Logger.getLogger(LoginServlet.class);

	private LoginService userValidationService = new LoginService();
	// private CourseService CourseService = new CourseService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// logs a debug message
		logger.debug("Get requset to login.do default servlet");
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("name"); // getting string name from name parameter of get request
		request.setAttribute("name", name); // setting the parameter as attribute
		String pass = request.getParameter("password");// same
		request.setAttribute("password", pass); // same
		if (userValidationService.isUserValid(name, pass)) { // calling user validation service to find a pare of name
																// and password is valid or not
			request.getSession().setAttribute("name", name);
			/*
			 * in a servlet every request is new. so if we set an attribute in request, it
			 * will be vanished in other servlet
			 */
			response.sendRedirect("/course");

		} else {
			request.setAttribute("passwordError", name + " is not registered");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}
}
