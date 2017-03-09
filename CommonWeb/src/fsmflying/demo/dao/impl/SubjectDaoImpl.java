package fsmflying.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

import fsmflying.demo.dao.SubjectDao;
import fsmflying.demo.dm.Subject;

public class SubjectDaoImpl implements SubjectDao {

	@Resource
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean add(Subject model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(Subject model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Subject getModel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
