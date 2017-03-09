package fsmflying.demo.dao;

import java.util.List;

//import fsmflying.demo.dm.Course;
import fsmflying.demo.dm.Subject;

public interface SubjectDao {
	public boolean add(Subject model);
	public boolean save(Subject model);
	public boolean delete(int id);
	public Subject getModel(int id);
	public List<Subject> getList();
}
