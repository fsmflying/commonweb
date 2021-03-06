package fsmflying.custom.service;

import java.util.List;

import fsmflying.custom.domain.Student;

public interface TestStudentService {
	boolean addStudent(Student model);

	boolean deleteStudent(int id);

	Student getStudent(int id);

	List<Student> listStudents();

	boolean updateStudent(Student id);

	int getMaxStudentId();

	int getMinStudentId();

	int getNextStudentId();
}
