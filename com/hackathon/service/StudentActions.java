package com.hackathon.service;

import java.util.List;

import com.hackathon.pojo.Student;
import com.hackathon.pojo.StudentSubmissions;

public class StudentActions {
	public StudentSubmissions answerSubmission(Student student, int testId, String testName, String subject, long teacherId, List<String> answer) {
		long studentId = student.getStudentId();
		StudentSubmissions studentSubmissions = new StudentSubmissions(studentId, testId, testName, subject, teacherId, answer);
		return studentSubmissions;
	}
	
	public void removeAnswer(int questionNumber, List<String> answer) {
		answer.set(questionNumber-1, null);		
	}
	
	public StudentSubmissions updateAnswer(Student student, int testId, String testName, String subject, long teacherId, List<String> answer, int questionNumber, String newAnswer) {
		answer.set(questionNumber-1, newAnswer);
		long studentId = student.getStudentId();
		StudentSubmissions studentSubmissions = new StudentSubmissions(studentId, testId, testName, subject, teacherId, answer);
		return studentSubmissions;
	}
	
	
}
