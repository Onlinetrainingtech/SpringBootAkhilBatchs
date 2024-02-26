package com.example.SpringB3H2DB.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringB3H2DB.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
