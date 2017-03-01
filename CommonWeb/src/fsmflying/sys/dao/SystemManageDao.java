package fsmflying.sys.dao;

import java.util.List;

import fsmflying.sys.domain.User;

public interface SystemManageDao {
	public boolean add(User model);
	public boolean deleteUser(int id);
	public boolean update(int id);
	public List<User> listUsers();
	public User getUser(int id);
}
