package com.hackathon.pojo;

import java.util.List;

public class StudentSubmissions {
	private long studentId;
	private int testId;
	private String testName;
	private String subject;
	private long teacherId;
	private List<String> answer;
	
	public StudentSubmissions() {
		
	}
	
	public StudentSubmissions(long studentId, int testId, String testName, String subject, long teacherId, List<String> answer) {
		this.studentId = studentId;
		this.testId = testId;
		this.testName=testName;
		this.subject=subject;
		this.teacherId = teacherId;
		this.answer = answer;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
}
