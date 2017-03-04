

package fsmflying.northwind.service.impl;

import java.util.List;

import javax.annotation.Resource;

import fsmflying.northwind.dao.NorthwindDao;
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
import fsmflying.northwind.service.NorthwindService;

public class NorthwindServiceImpl implements NorthwindService{

	NorthwindDao northwindDao;
	
	@Resource
	@Override
	public void setNorthwindDao(NorthwindDao northwindDao)
	{
		this.northwindDao = northwindDao;
	}



	@Override
	public boolean add(Order model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Order model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfOrder(int orderID){
		return northwindDao.deleteModelOfOrder(orderID);
	}
	
	@Override
	public Order getModelOfOrder(int orderID){
		
		return northwindDao.getModelOfOrder(orderID);
	}
	
	@Override
	public List<Order> getListOfOrder(){
		return northwindDao.getListOfOrder();
	}
	
	


	@Override
	public boolean add(OrderDetail model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(OrderDetail model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfOrderDetail(int orderID,int productID){
		return northwindDao.deleteModelOfOrderDetail(orderID,productID);
	}
	
	@Override
	public OrderDetail getModelOfOrderDetail(int orderID,int productID){
		return northwindDao.getModelOfOrderDetail(orderID,productID);
	}
	
	@Override
	public List<OrderDetail> getListOfOrderDetail(){
		return northwindDao.getListOfOrderDetail();
	}
	
	


	@Override
	public boolean add(Category model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Category model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfCategory(int categoryID){
		return northwindDao.deleteModelOfCategory(categoryID);
	}
	
	@Override
	public Category getModelOfCategory(int categoryID){
		return northwindDao.getModelOfCategory(categoryID);
	}
	
	@Override
	public List<Category> getListOfCategory(){
		return northwindDao.getListOfCategory();
	}
	
	


	@Override
	public boolean add(Employee model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Employee model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfEmployee(int employeeID){
		return northwindDao.deleteModelOfEmployee(employeeID);
	}
	
	@Override
	public Employee getModelOfEmployee(int employeeID){
		return northwindDao.getModelOfEmployee(employeeID);
	}
	
	@Override
	public List<Employee> getListOfEmployee(){
		return northwindDao.getListOfEmployee();
	}
	
	


	@Override
	public boolean add(Product model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Product model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfProduct(int productID){
		return northwindDao.deleteModelOfProduct(productID);
	}
	
	@Override
	public Product getModelOfProduct(int productID){
		return northwindDao.getModelOfProduct(productID);
	}
	
	@Override
	public List<Product> getListOfProduct(){
		return northwindDao.getListOfProduct();
	}
	
	


	@Override
	public boolean add(Shipper model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Shipper model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfShipper(int shipperID){
		return northwindDao.deleteModelOfShipper(shipperID);
	}
	
	@Override
	public Shipper getModelOfShipper(int shipperID){
		return northwindDao.getModelOfShipper(shipperID);
	}
	
	@Override
	public List<Shipper> getListOfShipper(){
		return northwindDao.getListOfShipper();
	}
	
	


	@Override
	public boolean add(Supplier model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Supplier model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfSupplier(int supplierID){
		return northwindDao.deleteModelOfSupplier(supplierID);
	}
	
	@Override
	public Supplier getModelOfSupplier(int supplierID){
		return northwindDao.getModelOfSupplier(supplierID);
	}
	
	@Override
	public List<Supplier> getListOfSupplier(){
		return northwindDao.getListOfSupplier();
	}
	
	


	@Override
	public boolean add(Customer model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Customer model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfCustomer(String customerID){
		return northwindDao.deleteModelOfCustomer(customerID);
	}
	
	@Override
	public Customer getModelOfCustomer(String customerID){
		return northwindDao.getModelOfCustomer(customerID);
	}
	
	@Override
	public List<Customer> getListOfCustomer(){
		return northwindDao.getListOfCustomer();
	}
	
	


	@Override
	public boolean add(Region model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Region model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfRegion(int regionID){
		return northwindDao.deleteModelOfRegion(regionID);
	}
	
	@Override
	public Region getModelOfRegion(int regionID){
		return northwindDao.getModelOfRegion(regionID);
	}
	
	@Override
	public List<Region> getListOfRegion(){
		return northwindDao.getListOfRegion();
	}
	
	


	@Override
	public boolean add(Territory model){
		return northwindDao.add(model);
	}
	
	@Override
	public boolean save(Territory model){
		return northwindDao.save(model);
	}
	
	@Override
	public boolean deleteModelOfTerritory(String territoryID){
		return northwindDao.deleteModelOfTerritory(territoryID);
	}
	
	@Override
	public Territory getModelOfTerritory(String territoryID){
		return northwindDao.getModelOfTerritory(territoryID);
	}
	
	@Override
	public List<Territory> getListOfTerritory(){
		return northwindDao.getListOfTerritory();
	}
	
	

}		
