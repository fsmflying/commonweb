package fsmflying.custom.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import fsmflying.custom.dao.TestStudentDAO;
import fsmflying.custom.domain.Student;

public class TestStudentDAOImpl implements TestStudentDAO {

	private JdbcTemplate mJdbcTemplate = new JdbcTemplate();

	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		// this.mJdbcTemplate = new JdbcTemplate(ds);
		this.mJdbcTemplate.setDataSource(ds);
	}

	@Override
	public boolean addStudent(Student model) {
		this.mJdbcTemplate.update(
				"insert into Student(id,name,age) values(?,?,?)",
				model.getId(), model.getName(), model.getAge());
		return true;
	}

	@Override
	public boolean deleteStudent(int id) {
		this.mJdbcTemplate.update("delete from Student where id=?", id);
		return true;
	}

	@Override
	public Student getStudent(int id) {
		Student model = (Student) this.mJdbcTemplate.queryForObject(
				"select * from Student where id=?", new Object[] { id },
				new StudentMapper());

		return model;
	}

	@Override
	public List<Student> listStudents() {
		List<Student> list = this.mJdbcTemplate.query("select * from Student", new StudentMapper());
		return list;
	}

	@Override
	public boolean updateStudent(Student model) {
		this.mJdbcTemplate.update("update Student set name=?,age=? where id=?",
				model.getName(),model.getAge(),model.getId());
		return true;
	}

	static class StudentMapper implements RowMapper<Student> {
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setAge(rs.getInt("age"));
			return student;
		}
	}

	@Override
	public int getMaxStudentId() {
		return this.mJdbcTemplate.queryForObject("select ifnull(max(id),-1) from student", Integer.class);
	}

	@Override
	public int getMinStudentId() {
		return this.mJdbcTemplate.queryForObject("select ifnull(min(id),-1) from student", Integer.class);
	}

	@Override
	public int getNextStudentId() {
		return this.mJdbcTemplate.queryForObject("select ifnull(max(id),1)+1 from student", Integer.class);
	}

}
