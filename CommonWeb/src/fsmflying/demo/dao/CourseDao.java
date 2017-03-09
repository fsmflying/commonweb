package fsmflying.demo.dao;

import java.util.List;

import fsmflying.demo.dm.Course;

public interface CourseDao {
	public boolean add(Course model);
	public boolean save(Course model);
	public boolean delete(int id);
	public Course getModel(int id);
	public List<Course> getList();
	
}
