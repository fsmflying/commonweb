package fsmflying.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

import fsmflying.demo.dao.ScoreDao;
import fsmflying.demo.dm.Score;

public class ScoreDaoImpl implements ScoreDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean add(Score model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save(Score model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Score getModel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Score> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
