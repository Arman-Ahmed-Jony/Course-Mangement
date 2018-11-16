package com.a2j.todo;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.a2j.login.servlet.LoginServlet;

public class TodoService {
	final static Logger logger = Logger.getLogger(LoginServlet.class);
	private static List<Todo> todos=new ArrayList<Todo>();
	static {
		todos.add(new Todo("learn web Application"));
		todos.add(new Todo("learn Spring MVC"));
		todos.add(new Todo("learn Spring rest service"));
		todos.add(new Todo("jsp servlet"));
	}
	
	public List<Todo> retriveTodos(){
		logger.debug(todos);
		return todos;
	}
	
	public void addTodos(String name) {
		Todo newTodo=new Todo(name);
		todos.add(newTodo);
		logger.debug(name+" "+"elements are added");
	}
	public void deleteTodos(Todo name) {
		todos.remove(name);	
		
		logger.debug(name+" "+"elements are deleted");
	}
	
	
}
