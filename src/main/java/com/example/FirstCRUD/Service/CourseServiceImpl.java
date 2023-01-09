 package com.example.FirstCRUD.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstCRUD.CourseDao.CourseDao;
import com.example.FirstCRUD.Model.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	//List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl()
	{
//		list = new ArrayList<>();
//		list.add(new Course(101,"JAVA","Refrence book to learn JAVA By James Gosling"));
//		list.add(new Course(102,"C","Refrence book to learn C By Denis Ritchie"));
	}
	

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(Long courseId) {
		
//		Course c = null;
//		for(Course course : list)
//		{
//			if(course.getId()==courseId)
//			{
//				c = course;
//				break;
//			}
//		}
		
		// TODO Auto-generated method stub
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course); 
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e ->{
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDesc(course.getDesc());
//			}
//		});
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		//list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
