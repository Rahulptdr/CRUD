package com.example.FirstCRUD.CourseDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FirstCRUD.Model.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
