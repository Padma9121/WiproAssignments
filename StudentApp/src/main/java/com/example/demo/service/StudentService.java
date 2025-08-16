package com.example.demo.service;

import java.util.List;



import com.example.demo.entities.Student;


public interface StudentService {

	public List<Student> getAll();

	public void save(Student college);

	public Student getById(Long id);

	public void delete(Long id);

	

	

}
