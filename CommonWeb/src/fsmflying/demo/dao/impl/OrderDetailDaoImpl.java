package fsmflying.demo.dao.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import fsmflying.demo.dao.OrderDetailDao;
import fsmflying.demo.dm.OrderDetail;

public class OrderDetailDaoImpl implements OrderDetailDao {

	protected JdbcTemplate jdbcTemplate;

	@Resource
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean add(OrderDetail model) {
		this.jdbcTemplate
				.update("insert into orderdetails(orderDetailId,orderId,productId,unitPrice,quantity,discount) values(?,?,?,?,?,?)",
						model.getOrderDetailId(), model.getOrderId(),
						model.getProductId(), model.getUnitPrice(),
						model.getQuantity(), model.getDiscount());
		return true;
	}

	@Override
	public boolean addWithError(OrderDetail model) {
		this.jdbcTemplate
		.update("insert into orderdetail(orderDetailId,orderId,productId,unitPrice,quantity,discount) values(?,?,?,?,?,?)",
				model.getOrderDetailId(), model.getOrderId(),
				model.getProductId(), model.getUnitPrice(),
				model.getQuantity(), model.getDiscount());
		return true;
	}

}
