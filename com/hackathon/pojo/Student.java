package com.hackathon.pojo;

public class Student {
	private long studentId;
	private String name;
	private int mark;
	
	public Student() {
		
	}
	
	public Student(long studentId, String name, int mark) {
		this.studentId = studentId;
		this.name = name;
		this.mark = mark;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
	
}
