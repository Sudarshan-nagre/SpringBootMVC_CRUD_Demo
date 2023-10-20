package com.sud.mvc.service;

import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sud.mvc.model.Student;
import com.sud.mvc.repo.StudentDao;
import com.sud.mvc.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student findStudent(Student student) {
		return studentDao.findStudent(student);
		
		/*
		 * Optional<Student> st = studentRepo.findById(student.getRollNo());
		 * if(st.isPresent()) { return st.get(); }else { return new Student(); }
		 */
	}

	@Override
	public Student deleteStudent(int rollNo) {
		studentRepo.deleteById(rollNo);
		return null;
	}

}
