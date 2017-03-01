package fsmflying.northwind.dao;

import java.util.List;

import javax.sql.DataSource;

import fsmflying.northwind.dm.Category;
import fsmflying.northwind.dm.Customer;
import fsmflying.northwind.dm.Shipper;
import fsmflying.northwind.dm.Supplier;

public interface NorthwindDao {
	
	public void setDataSource(DataSource ds);
	
	public boolean add(Category model);
	public boolean deleteCategory(int id);
	public boolean update(Category model);
	public Category getModelOfCategory(int id);
	public List<Category> getListOfCategory();
	public int getMaxCategoryId();
	public int getMinCategoryId();
	public int getNextCategoryId();
	
	public boolean add(Customer model);
	public boolean deleteCustomer(String id);
	public boolean update(Customer model);
	public Customer getModelOfCustomer(String id);
	public List<Customer> getListOfCustomer();
	
	public boolean add(Shipper model);
	public boolean deleteShipper(int id);
	public boolean update(Shipper model);
	public Shipper getModelOfShipper(int id);
	public List<Shipper> getListOfShipper();
	
	public boolean add(Supplier model);
	public boolean deleteSupplier(int id);
	public boolean update(Supplier model);
	public Supplier getModelOfSupplier(int id);
	public List<Supplier> getListOfSupplier();
	
	
}
