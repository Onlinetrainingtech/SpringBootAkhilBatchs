package com.example.SpringBootH2Db.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootH2Db.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}