package fsmflying.demo.service;

import java.util.List;

import fsmflying.demo.dm.Course;
import fsmflying.demo.dm.Student;
import fsmflying.demo.dm.Subject;
import fsmflying.demo.dm.Teacher;

public interface EducationService {
	
	public boolean add(Subject model);
	public boolean save(Subject model);
	public boolean deleteModelOfSubject(int id);
	public Subject getModelOfSubject(int id);
	public List<Subject> getListOfSubject();
	
	public boolean add(Teacher model);
	public boolean save(Teacher model);
	public boolean deleteModelOfTeacher(int id);
	public Teacher getModelOfTeacher(int id);
	public List<Teacher> getListOfTeacher();
	
	public boolean add(Course model);
	public boolean save(Course model);
	public boolean deleteModelOfCourse(int id);
	public Course getModelOfCourse(int id);
	public List<Course> getListOfCourse();
	
	public boolean add(Student model);
	public boolean save(Student model);
	public boolean deleteModelOfStudent(int id);
	public Student getModelOfStudent(int id);
	public List<Student> getListOfStudent();
	public boolean attendCourse(int studentId,int courseId);
	public boolean addScore(int studentId,int courseId,int score);
	
	
	
	
}
