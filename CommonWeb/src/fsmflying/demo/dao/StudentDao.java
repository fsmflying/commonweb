package fsmflying.demo.dao;

import java.util.List;

import fsmflying.demo.dm.Student;

public interface StudentDao {
	public boolean add(Student model);
	public boolean save(Student model);
	public boolean delete(int id);
	public Student getModel(int id);
	public List<Student> getList();
	public boolean addCourse(int courseId,int teacherId);
}
