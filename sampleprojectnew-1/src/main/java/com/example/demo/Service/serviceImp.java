package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.domain.Student;

@Service
public class serviceImp implements service {
	
	@Autowired
	private StudentRepository studentRepository;

	public serviceImp(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@Override
	public Student savestud(Student student) {
		return studentRepository.save(student);
	}

}
