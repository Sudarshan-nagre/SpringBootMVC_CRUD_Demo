package com.sud.mvc.service;

import com.sud.mvc.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	
	public Student findStudent(Student student);
	
	public Student deleteStudent(int rollNo);
}
