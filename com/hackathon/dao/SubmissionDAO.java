package com.hackathon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.hackathon.pojo.StudentSubmissions;

public class SubmissionDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String username = "root";
	private String password = "root";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private int count;
	private List<String> answer; 

	public boolean addSubmission(StudentSubmissions studentSubmissions) {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			for (int i = 0; i < studentSubmissions.getAnswer().size(); i++) {
				String sql = "insert into answer_submissions values(?,?,?,?,?,?,?)";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setLong(1, studentSubmissions.getStudentId());
				preparedStatement.setInt(2, studentSubmissions.getTestId());
				preparedStatement.setString(3, studentSubmissions.getTestName());
				preparedStatement.setString(4, studentSubmissions.getSubject());
				preparedStatement.setLong(5, studentSubmissions.getTeacherId());
				preparedStatement.setInt(6, i+1);
				preparedStatement.setString(7, studentSubmissions.getAnswer().get(i));
			}
			count = preparedStatement.executeUpdate();

			if (count > 0) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");

		} catch (SQLException e) {
			System.out.println("Connection failed");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Connection failed");
				System.out.println(e.getMessage());
			}
		}
		return false;
	}
	
	public List<String> getAnswer(long studentId) {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			String sql = "select *from member_details where employee_id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, studentId);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				answer.add(resultSet.getString("answer"));
			}
			return answer;
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver");

		} catch (SQLException e) {
			System.out.println("Connection failed");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Connection failed");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

}
