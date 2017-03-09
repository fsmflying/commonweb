package fsmflying.demo.dm;

import java.util.Date;
import java.util.List;

public class Order {
	private int orderId;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private String shipAddress;
	private List<OrderDetail> details;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, Date orderDate, Date requiredDate,
			Date shippedDate, String shipAddress, List<OrderDetail> details) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.shipAddress = shipAddress;
		this.details = details;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}
	
}
