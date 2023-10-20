package com.sud.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sud.mvc.model.Student;
import com.sud.mvc.service.StudentService;

@Controller()
public class StudentController {

	private static Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String showHomePage() {
		
		logger.info("This is home mapping");
		logger.error("This is home error");
		logger.warn("This is warning");
		
		return "homePage";
	}

	@GetMapping("saveStudent")
	public String saveStudentView(Model model) {
		model.addAttribute("student", new Student());
		return "saveStudent";
	}
	
	@PostMapping("saveStudent")
	public String saveStudent(Model model, @ModelAttribute("student") Student student) {
		Student st = studentService.saveStudent(student);
		
		if(st.getRollNo() > 0) {
			model.addAttribute("msg", "Thank you fpr registration !!!");
			model.addAttribute("student", new Student());
		}else {
			model.addAttribute("msg", "Regisatrtion failed ...Try again !!");
		}
		return "saveStudent";
	}
	
	@GetMapping("findStudent")
	public String findStudentView(Model model) {
		model.addAttribute("student", new Student());
		return "findStudent";
	}
	
	@PostMapping("findStudent")
	public String findStudent(Model model, @ModelAttribute("student") Student student) {
		Student st = studentService.findStudent(student);
		
		if(st.getRollNo() > 0) {
			student.setName(st.getName());
			student.setMobile(st.getMobile());
			student.setEmail(st.getEmail());
			student.setAddress(st.getAddress());
			student.setRollNo(st.getRollNo());
			
			model.addAttribute("student", student);
		}else {
			model.addAttribute("msg", "Student Not found");
		}
		return "viewStudent";
	}
	
	@GetMapping("deleteStudent")
	public String deleteStudent(Model model, @RequestParam int rollNo) {
		studentService.deleteStudent(rollNo);
		model.addAttribute("msg", "Student Deleted Success !!");
		return "viewStudent";
	}
}
