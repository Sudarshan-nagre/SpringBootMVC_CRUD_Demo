package com.sud.mvc.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sud.mvc.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private SessionFactory factory;
	
	public Student findStudent(Student student) {
		Session session = factory.openSession();
		return session.get(Student.class, student.getRollNo());
	}
}
