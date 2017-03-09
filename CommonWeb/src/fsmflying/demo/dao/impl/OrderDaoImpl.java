package fsmflying.demo.dao.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import fsmflying.demo.dao.OrderDao;
import fsmflying.demo.dm.Order;

public class OrderDaoImpl implements OrderDao {

	protected JdbcTemplate jdbcTemplate;

	@Resource
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean add(Order model) {
		this.jdbcTemplate
				.update("insert into orders(orderId,orderDate,requiredDate,shippedDate,shipAddress) "
						+ "values(?,?,?,?,?)",
						model.getOrderId(), model.getOrderDate(),
						model.getRequiredDate(), model.getShippedDate(),
						model.getShipAddress());
		return true;
	}

	@Override
	public boolean addWithError(Order model) {
		this.jdbcTemplate
		.update("insert into order(orderId,orderDate,requiredDate,shippedDate,shipAddress) "
				+ "values(?,?,?,?,?)",
				model.getOrderId(), model.getOrderDate(),
				model.getRequiredDate(), model.getShippedDate(),
				model.getShipAddress());
		return false;
	}

}
