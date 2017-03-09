package fsmflying.demo.service;

import fsmflying.demo.dm.Order;

public interface OrderService {
	public boolean addOrder(Order model);
	public boolean addOrderWithOrderError(Order model);
	public boolean addOrderWithDetailError(Order model);
	public boolean addOrderByTrans(Order model);
	public boolean addOrderWithOrderErrorByTrans(Order model);
	public boolean addOrderWithDetailErrorByTrans(Order model);
	
//	public boolean addOrderWithOrderError(Order model);
}
