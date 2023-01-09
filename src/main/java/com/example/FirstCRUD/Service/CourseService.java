package com.example.FirstCRUD.Service;

import java.util.List;

import com.example.FirstCRUD.Model.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(Long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);
}
