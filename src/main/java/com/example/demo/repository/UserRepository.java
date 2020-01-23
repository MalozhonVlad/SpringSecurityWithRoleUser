package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Student, String> {

    Student findByUsername(String username);

}
