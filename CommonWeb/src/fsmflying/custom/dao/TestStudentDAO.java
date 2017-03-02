package fsmflying.custom.dao;

import java.util.List;

import javax.sql.DataSource;

import fsmflying.custom.domain.Student;

public interface TestStudentDAO {
	
	   public void setDataSource(DataSource ds);
	   public boolean addStudent(Student model);
	   public	boolean deleteStudent(int id);
	   public Student getStudent(int id);
	   public List<Student> listStudents();
	   public	boolean updateStudent(Student model);
	   public int getMaxStudentId();
	   public int getMinStudentId();
	   public int getNextStudentId();
	   
}
