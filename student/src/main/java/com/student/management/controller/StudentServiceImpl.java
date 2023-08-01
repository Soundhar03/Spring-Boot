package com.student.management.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Primary
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student getStudentById(ObjectId id) {
		return studentRepository.findById(id).get();
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudentById(ObjectId id) {
		studentRepository.deleteById(id);	
	}
}
