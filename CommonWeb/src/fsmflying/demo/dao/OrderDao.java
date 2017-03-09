package fsmflying.demo.dao;

import fsmflying.demo.dm.Order;

public interface OrderDao {
	public boolean add(Order model);
	public boolean addWithError(Order model);
}
