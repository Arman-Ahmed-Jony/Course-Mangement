package com.a2j.todo;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.a2j.login.servlet.LoginServlet;

public class TodoService {
	final static Logger logger = Logger.getLogger(LoginServlet.class);
	private static List<Todo> todos=new ArrayList<Todo>();
	static {
		todos.add(new Todo("learn web Application","156"));
		todos.add(new Todo("learn Spring MVC","156"));
		todos.add(new Todo("learn Spring rest service","156"));
		todos.add(new Todo("jsp servlet","156"));
	}
	
	public List<Todo> retriveTodos(){
		logger.debug(todos);
		return todos;
	}
	
	public void addTodos(String name,String price) {
		Todo newTodo=new Todo(name, price);
		todos.add(newTodo);
		logger.debug(name+" "+price +"elements are added");
	}
	public void deleteTodos(Todo name) {
		todos.remove(name);	
		
		logger.debug(name+" "+"elements are deleted");
	}
	
	
}
