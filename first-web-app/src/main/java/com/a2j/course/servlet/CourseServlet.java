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

package com.a2j.course.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.a2j.course.Course;
import com.a2j.course.CourseService;
import com.a2j.login.LoginService;

@WebServlet(urlPatterns = "/course")
public class CourseServlet extends HttpServlet {
	final static Logger logger = Logger.getLogger(CourseServlet.class);

	private CourseService CourseService = new CourseService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// logs a debug message
		logger.debug("todo servelet doGet methode is executed");
		request.setAttribute("courses", CourseService.retriveTodos());
		request.getRequestDispatcher("/WEB-INF/views/course.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.debug("todo servelet doPost methode is executed");
		logger.debug(request.getParameter("newTodo").toString());
		String newTodo = request.getParameter("newTodo");
		String price = request.getParameter("price");
		if (newTodo != ""&& price!="")
			CourseService.addTodos(newTodo,price);

		response.sendRedirect("/course");
		
		/*
		 * request.setAttribute("todos", CourseService.retriveTodos());
		 * request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request,
		 * response);
		 */
	}

}