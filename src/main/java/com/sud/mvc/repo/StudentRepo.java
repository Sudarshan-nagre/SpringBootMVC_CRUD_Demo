package com.sud.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sud.mvc.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
