package fsmflying.custom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsmflying.custom.dao.TestStudentDAO;
import fsmflying.custom.domain.Student;
import fsmflying.custom.service.TestStudentService;

public class TestStudentServiceImpl implements TestStudentService{

	@Autowired
	private TestStudentDAO testStudentDAO;
	
	@Override
	public boolean addStudent(Student model) {
		return testStudentDAO.addStudent(model);
	}

	@Override
	public boolean deleteStudent(int id) {
		return testStudentDAO.deleteStudent(id);
	}

	@Override
	public Student getStudent(int id) {
		return testStudentDAO.getStudent(id);
	}

	@Override
	public List<Student> listStudents() {
		return testStudentDAO.listStudents();
	}

	@Override
	public boolean updateStudent(Student model) {
		return testStudentDAO.updateStudent(model);
	}

	@Override
	public int getMaxStudentId() {
		return testStudentDAO.getMaxStudentId();
	}

	@Override
	public int getMinStudentId() {
		return testStudentDAO.getMinStudentId();
	}

	@Override
	public int getNextStudentId() {
		return testStudentDAO.getNextStudentId();
	}
	
	

}
