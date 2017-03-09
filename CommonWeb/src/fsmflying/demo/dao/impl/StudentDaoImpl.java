package fsmflying.demo.dao.impl;

import java.util.List;

import fsmflying.demo.dao.StudentDao;
import fsmflying.demo.dm.Student;

public class StudentDaoImpl extends JdbcTemplateDaoBase implements StudentDao {

	@Override
	public boolean add(Student model) {

		this.jdbcTemplate.update(
				"insert into students(id,name,sex,birthDate) values(?,?,?,?)",
				model.getId(), model.getName(), model.getSex(),
				model.getBirthDate());
		return false;
	}

	@Override
	public boolean save(Student model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getModel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCourse(int courseId, int teacherId) {
		// TODO Auto-generated method stub
		return false;
	}
}
