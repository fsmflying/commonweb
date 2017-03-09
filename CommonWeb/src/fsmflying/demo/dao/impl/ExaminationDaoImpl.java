package fsmflying.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

import fsmflying.demo.dao.ExaminationDao;
import fsmflying.demo.dm.Examination;

public class ExaminationDaoImpl implements ExaminationDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean add(Examination model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(Examination model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Examination getModel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Examination> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
