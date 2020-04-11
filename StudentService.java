package com.jsp.student;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


@Service
public class StudentService {
	
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	public List<Student> getAllStudent(){
		List<Student> students = new ArrayList<>();
		
		 studentRepository.findAll()
		 .forEach(students::add);
		 return students;
	}
	
	
	public Optional<Student> getStudent(String regNo)
	{
		return studentRepository.findById(regNo);
		
		
		
	}
	
	
	public void addStudent(Student student)
	{
		studentRepository.save(student);
		
	}

	
	
	
	public void updateStudent(String regNo ,Student student)
	{
		studentRepository.save(student);
	}
	
	
	public void deleteStudent(String regNo)
	{
		 
		studentRepository.deleteById(regNo);
	}
}
