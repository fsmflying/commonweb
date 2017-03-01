package fsmflying.northwind.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fsmflying.northwind.dao.NorthwindDao;
import fsmflying.northwind.dm.Category;
import fsmflying.northwind.dm.Customer;
import fsmflying.northwind.dm.Shipper;
import fsmflying.northwind.dm.Supplier;
import fsmflying.northwind.service.NorthwindService;

public class NorthwindServiceImpl implements NorthwindService {

	@Autowired
	NorthwindDao northwindDao;
	
	@Override
	public boolean add(Category model) {
		return northwindDao.add(model);
	}

	@Override
	public boolean deleteCategory(int id) {
		return northwindDao.deleteCategory(id);
	}

	@Override
	public boolean update(Category model) {
		return northwindDao.update(model);
	}

	@Override
	public Category getCategory(int id) {
		return northwindDao.getModelOfCategory(id);
				
	}

	@Override
	public List<Category> getListOfCategory() {
		return northwindDao.getListOfCategory();
	}

	@Override
	public int getMaxCategoryId() {
		return northwindDao.getMaxCategoryId();
	}

	@Override
	public int getMinCategoryId() {
		return northwindDao.getMinCategoryId();
	}

	@Override
	public int getNextCategoryId() {
		return northwindDao.getNextCategoryId();
	}

	@Override
	public boolean add(Customer model) {
		return northwindDao.add(model);
	}

	@Override
	public boolean deleteCustomer(String id) {
		return northwindDao.deleteCustomer(id);
	}

	@Override
	public boolean update(Customer model) {
		return northwindDao.update(model);
	}

	@Override
	public Customer getCustomer(String id) {
		return northwindDao.getModelOfCustomer(id);
	}

	@Override
	public List<Customer> getListOfCustomer() {
		return northwindDao.getListOfCustomer();
	}

	@Override
	public boolean add(Shipper model) {
		return northwindDao.add(model);
	}

	@Override
	public boolean deleteShipper(int id) {
		return northwindDao.deleteShipper(id);
	}

	@Override
	public boolean update(Shipper model) {
		return northwindDao.update(model);
	}

	@Override
	public Shipper getShipper(int id) {
		return northwindDao.getModelOfShipper(id);
	}

	@Override
	public List<Shipper> getListOfShipper() {
		return northwindDao.getListOfShipper();
	}

	@Override
	public boolean add(Supplier model) {
		return northwindDao.add(model);
	}

	@Override
	public boolean deleteSupplier(int id) {
		return northwindDao.deleteSupplier(id);
	}

	@Override
	public boolean update(Supplier model) {
		return northwindDao.update(model);
	}

	@Override
	public Supplier getSupplier(int id) {
		return northwindDao.getModelOfSupplier(id);
	}

	@Override
	public List<Supplier> getListOfSupplier() {
		return northwindDao.getListOfSupplier();
	}

}
