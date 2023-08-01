package com.student.management.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(ObjectId id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(ObjectId id);
}
