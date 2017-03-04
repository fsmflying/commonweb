

package fsmflying.northwind.dao;

import java.util.List;
import javax.sql.DataSource;

import fsmflying.northwind.dm.Order;
import fsmflying.northwind.dm.OrderDetail;
import fsmflying.northwind.dm.Category;
import fsmflying.northwind.dm.Employee;
import fsmflying.northwind.dm.Product;
import fsmflying.northwind.dm.Shipper;
import fsmflying.northwind.dm.Supplier;
import fsmflying.northwind.dm.Customer;
import fsmflying.northwind.dm.Region;
import fsmflying.northwind.dm.Territory;


public interface NorthwindDao{

	public void setDataSource(DataSource dataSource);


	
	public boolean add(Order model);
	public boolean save(Order model);
	public boolean deleteModelOfOrder(int orderID);
	public Order getModelOfOrder(int orderID);
	public List<Order> getListOfOrder();


	
	public boolean add(OrderDetail model);
	public boolean save(OrderDetail model);
	public boolean deleteModelOfOrderDetail(int orderID,int productID);
	public OrderDetail getModelOfOrderDetail(int orderID,int productID);
	public List<OrderDetail> getListOfOrderDetail();


	
	public boolean add(Category model);
	public boolean save(Category model);
	public boolean deleteModelOfCategory(int categoryID);
	public Category getModelOfCategory(int categoryID);
	public List<Category> getListOfCategory();


	
	public boolean add(Employee model);
	public boolean save(Employee model);
	public boolean deleteModelOfEmployee(int employeeID);
	public Employee getModelOfEmployee(int employeeID);
	public List<Employee> getListOfEmployee();


	
	public boolean add(Product model);
	public boolean save(Product model);
	public boolean deleteModelOfProduct(int productID);
	public Product getModelOfProduct(int productID);
	public List<Product> getListOfProduct();


	
	public boolean add(Shipper model);
	public boolean save(Shipper model);
	public boolean deleteModelOfShipper(int shipperID);
	public Shipper getModelOfShipper(int shipperID);
	public List<Shipper> getListOfShipper();


	
	public boolean add(Supplier model);
	public boolean save(Supplier model);
	public boolean deleteModelOfSupplier(int supplierID);
	public Supplier getModelOfSupplier(int supplierID);
	public List<Supplier> getListOfSupplier();


	
	public boolean add(Customer model);
	public boolean save(Customer model);
	public boolean deleteModelOfCustomer(String customerID);
	public Customer getModelOfCustomer(String customerID);
	public List<Customer> getListOfCustomer();


	
	public boolean add(Region model);
	public boolean save(Region model);
	public boolean deleteModelOfRegion(int regionID);
	public Region getModelOfRegion(int regionID);
	public List<Region> getListOfRegion();


	
	public boolean add(Territory model);
	public boolean save(Territory model);
	public boolean deleteModelOfTerritory(String territoryID);
	public Territory getModelOfTerritory(String territoryID);
	public List<Territory> getListOfTerritory();

}
