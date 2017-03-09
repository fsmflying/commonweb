package fsmflying.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import fsmflying.demo.dao.OrderDao;
import fsmflying.demo.dao.OrderDetailDao;
import fsmflying.demo.dm.Order;
import fsmflying.demo.dm.OrderDetail;
import fsmflying.demo.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Resource
	OrderDao orderDao;

	@Resource
	OrderDetailDao orderDetailDao;

	@Override
	public boolean addOrder(Order model) {
		orderDao.add(model);
		if (model.getDetails() != null && model.getDetails().size() > 0)
			for (OrderDetail detail : model.getDetails())
				orderDetailDao.add(detail);
		return true;
	}

	@Override
	public boolean addOrderWithOrderError(Order model) {
		orderDao.addWithError(model);
		if (model.getDetails() != null && model.getDetails().size() > 0)
			for (OrderDetail detail : model.getDetails())
				orderDetailDao.add(detail);
		return true;
	}

	@Override
	public boolean addOrderWithDetailError(Order model) {
		orderDao.add(model);
		if (model.getDetails() != null && model.getDetails().size() > 0)
			for (OrderDetail detail : model.getDetails())
				orderDetailDao.addWithError(detail);
		return true;
	}

//	@Transactional("txManager")
	@Override
	public boolean addOrderByTrans(Order model) {
		orderDao.add(model);
		if (model.getDetails() != null && model.getDetails().size() > 0)
			for (OrderDetail detail : model.getDetails())
				orderDetailDao.add(detail);
		return true;
	}

//	@Transactional("txManager")
	@Override
	public boolean addOrderWithOrderErrorByTrans(Order model) {
		orderDao.addWithError(model);
		if (model.getDetails() != null && model.getDetails().size() > 0)
			for (OrderDetail detail : model.getDetails())
				orderDetailDao.add(detail);
		return true;
	}

//	@Transactional("txManager")
	@Override
	public boolean addOrderWithDetailErrorByTrans(Order model) {
		orderDao.add(model);
		if (model.getDetails() != null && model.getDetails().size() > 0)
			for (OrderDetail detail : model.getDetails())
				orderDetailDao.addWithError(detail);
		return true;
	}

	

}
