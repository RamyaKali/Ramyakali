package com.ums.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ums.dao.UserDAO;
import com.ums.entity.User;



@WebServlet("/")
public class UserServlet extends HttpServlet {
	private UserDAO userDAO;
	public void init() {
		userDAO=new UserDAO();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	doGet(request, response);
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {

			case "/insert":
				insertUser(request, response);
				break;
			case "/new":
				showForm(request, response);
				break;
			case "/delete":
				deleteUser(request, response);
				break;
			case "/edit":
				EditUser(request, response);
				break; 
			case "/update":
				updateUser(request, response);
				break;
			default:
				listUser(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	

	private void showForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher=request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
		
	}


	private void EditUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("EDIT USER FUNCTION CALLED");
			int id = Integer.parseInt(request.getParameter("id"));
			User existingUser = userDAO.selectUser(id);
			System.out.println(existingUser.toString());
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
			request.setAttribute("user", existingUser);
			dispatcher.forward(request,response);

		}
		
	private void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" List all Users");
		List<User> list =userDAO.selectAllUsers();
		request.setAttribute("listUser", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
		
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException, ServletException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String mobileno = request.getParameter("mobileno");
		String location = request.getParameter("location");
		User user = new User(name, email,password,mobileno, location);
		userDAO.insertUser(user);
		response.sendRedirect("list");
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request,response);
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String mobileno = request.getParameter("mobileno");		
		String location = request.getParameter("location");

		User user = new User(id, name,email, password, mobileno,location);
		userDAO.UpdateUser(user);
		response.sendRedirect("list");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		System.out.println("Delete method called");
		int id = Integer.parseInt(request.getParameter("id"));
		userDAO.deleteUser(id);
		response.sendRedirect("list");

	}

}
	