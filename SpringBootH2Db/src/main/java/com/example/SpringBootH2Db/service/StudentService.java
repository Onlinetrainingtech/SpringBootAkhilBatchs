package com.example.SpringBootH2Db.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootH2Db.model.Student;
import com.example.SpringBootH2Db.repository.StudentRepository;

@Service
public class StudentService
{

	
	@Autowired
	StudentRepository studentRepository;
	
	//getting all the student records
	
	public List<Student>getAllStudent()
	{
		List<Student>students=new ArrayList<Student>();
		
		studentRepository.findAll().forEach(student->students.add(student));
		return students;
	}
	
	//getting a specific record
	
	public Student getStudentById(int id)
	{
		return studentRepository.findById(id).get();
	}
	
	public void SaveOrUpdate(Student student)
	{
		studentRepository.save(student);
	}
	//deleting the specific record
	
	public void delete(int id)
	{
		studentRepository.deleteById(id);
	}
	
	//update a record
	
	public void update(Student student,int id)
	{
		studentRepository.save(student);
	}
}