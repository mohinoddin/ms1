package com.jsp.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

	
	
	
		@Autowired
		private StudentService studentservice;

		@RequestMapping("/students")
		public List<Student> getAllStudent() {
		return studentservice.getAllStudent();
		}
		
		@RequestMapping("/students/{regNo}")
		public Optional<Student> getStudent(@PathVariable String regNo) {
		return studentservice.getStudent(regNo);
		}


		@RequestMapping(method=RequestMethod.POST, value="/students")
		public void addStudent(@RequestBody Student topic) {
			studentservice.addStudent(topic) ;
		}


		@RequestMapping(method=RequestMethod.PUT, value="/students/{regNo}")
		public void updateStudent(@RequestBody Student topic,@PathVariable String id) {
			studentservice.updateStudent(id,topic) ;
		}

		@RequestMapping(method=RequestMethod.DELETE, value="/students/{regNo}")
		public void deleteStudent(@PathVariable String regNo) {
			studentservice.deleteStudent(regNo) ;
		}
	

}
