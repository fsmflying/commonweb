package fsmflying.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

import fsmflying.demo.dao.CourseDao;
import fsmflying.demo.dm.Course;

public class CourseDaoImpl implements CourseDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean add(Course model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(Course model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Course getModel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
