package com.toavina.reactintegration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toavina.reactintegration.entities.Student;

public interface StudentRepositories extends JpaRepository<Student, Integer> {

}
