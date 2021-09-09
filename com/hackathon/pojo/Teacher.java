package com.hackathon.pojo;

public class Teacher {
	private long teacherId;
	private String name;
	
	public Teacher() {
		
	}
	
	public Teacher(long teacherId, String name) {
		this.teacherId = teacherId;
		this.name = name;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
