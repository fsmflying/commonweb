package fsmflying.demo.dao;

import java.util.List;

import fsmflying.demo.dm.Teacher;

public interface TeacherDao {
	public boolean add(Teacher model);
	public boolean save(Teacher model);
	public boolean delete(int id);
	public Teacher getModel(int id);
	public List<Teacher> getList();
}
