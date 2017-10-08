package com.lin.luo.tian.spring.jpa.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lin.luo.tian.spring.jpa.domain.Student;

public interface StudentRepositry extends JpaRepository<Student, Long>{
	public static final String QUERY_NAME = "select s from Student s where s.name = :name";
	
	@Query(QUERY_NAME)
	public Student getStudentWithName(@Param("name") String name);
}
