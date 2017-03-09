package fsmflying.demo.dao;

import java.util.List;

import fsmflying.demo.dm.Score;

public interface ScoreDao {
	public boolean add(Score model);
	public boolean save(Score model);
	public boolean delete(int id);
	public Score getModel(int id);
	public List<Score> getList();
}
