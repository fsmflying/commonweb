package fsmflying.demo.dao;

import java.util.List;

import fsmflying.demo.dm.Examination;

public interface ExaminationDao {
	public boolean add(Examination model);
	public boolean save(Examination model);
	public boolean delete(int id);
	public Examination getModel(int id);
	public List<Examination> getList();
}
