package com.ums.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ums.entity.User;

public class UserDAO {
	private String USERNAME="root";
	private String PASSWORD="Ramyakali#@1794";
	private String URL= "jdbc:mysql://localhost:3306/ums";
	private String DRIVER="com.mysql.cj.jdbc.Driver";
	private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email,password, mobilenumber,location) VALUES "
			+ " (?, ?, ?,? , ?);";

	private static final String SELECT_USER_BY_ID = "select * from users where id =?";
	private static final String SELECT_ALL_USERS = "select * from users";
	private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, password = ?,mobilenumber= ?,location =? where id = ?;";

	private  Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			}
		return conn;
		}
	
	public List<User> selectAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String mobilenumber = rs.getString("mobilenumber");
				String location = rs.getString("location");
				users.add(new User(id, name, email,password, mobilenumber, location));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return users;
		
		
	 
}
	public User selectUser(int id) {User user = null;
	// Step 1: Establishing a Connection
	try (Connection connection = getConnection();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
		preparedStatement.setInt(1, id);
		System.out.println(preparedStatement);
		// Step 3: Execute the query or update query
		ResultSet rs = preparedStatement.executeQuery();

		// Step 4: Process the ResultSet object.
		while (rs.next()) {
			String name = rs.getString("name");
			String email = rs.getString("email");
			String password = rs.getString("password");
			String mobileno = rs.getString("mobilenumber");
			String location = rs.getString("location");
			user = new User(id, name,email,password,mobileno,location);
		}
	} catch (SQLException e) {
		printSQLException(e);
	}
	return user;
}

	
	public void insertUser(User user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
		
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setString(4, user.getMobileno());
			preparedStatement.setString(5, user.getLocation());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}



	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

	public boolean deleteUser(int id) throws SQLException {
		// TODO Auto-generated method stub
		boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
	}
	
	
public boolean UpdateUser (User user) throws SQLException {
	boolean rowUpdated;
    try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
        statement.setString(1, user.getName());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getPassword());
        statement.setString(4, user.getMobileno());
        statement.setString(5, user.getLocation());
        statement.setInt(6, user.getId());

        rowUpdated = statement.executeUpdate() > 0;
    }
    return rowUpdated;

}


public User EditUser(int id) {
	// TODO Auto-generated method stub
	return null;
}



	}


