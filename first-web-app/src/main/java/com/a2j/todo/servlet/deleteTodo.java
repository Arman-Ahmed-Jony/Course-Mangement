package com.a2j.todo.servlet;
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


import com.a2j.todo.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.a2j.login.LoginService;
import com.a2j.todo.Todo;
import com.a2j.todo.TodoService;

@WebServlet(urlPatterns = "/deleteTodo.do")
public class deleteTodo extends HttpServlet {
	final static Logger logger = Logger.getLogger(deleteTodo.class);

	private TodoService TodoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// logs a debug message
		logger.debug("deleteTodo servelet doGet methode is executed");
		TodoService.deleteTodos(new Todo(request.getParameter("todo")));
		response.sendRedirect("/todo.do");
	}


}