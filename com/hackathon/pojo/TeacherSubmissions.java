package com.hackathon.pojo;

import java.util.List;

public class TeacherSubmissions {
	private long teacherId;
	private List<String> answer;
	
	public TeacherSubmissions() {
		
	}
	
	public TeacherSubmissions(long teacherId, List<String> answer) {
		this.teacherId=teacherId;
		this.answer = answer;
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

	@Override
	public String toString() {
		return "TeacherSubmissions [teacherId=" + teacherId + ", answer=" + answer + "]";
	}
	
	
}
