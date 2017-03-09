package fsmflying.demo.dao;

import fsmflying.demo.dm.OrderDetail;

public interface OrderDetailDao {
	public boolean add(OrderDetail model);
	public boolean addWithError(OrderDetail model);
}
