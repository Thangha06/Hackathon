package com.hackathon.service;

import java.util.List;

import com.hackathon.pojo.StudentSubmissions;
import com.hackathon.pojo.Teacher;
import com.hackathon.pojo.TeacherSubmissions;

public class TeacherActions {
	public TeacherSubmissions standardAnswer(Teacher teacher, List<String> answer) {
		long teacherId = teacher.getTeacherId();
		TeacherSubmissions teacherSubmissions = new TeacherSubmissions(teacherId, answer);
		return teacherSubmissions;
	}
	
	public int evaluateMarks(TeacherSubmissions teacherSubmissions, StudentSubmissions studentSubmissions) {
		List<String> correctAnswers = teacherSubmissions.getAnswer();
		List<String> submittedAnswers = studentSubmissions.getAnswer();
		int marks=0;
		
		for(int i=0; i<correctAnswers.size(); i++) {
			marks = 0;
		}
		
		return marks;
	}
}
