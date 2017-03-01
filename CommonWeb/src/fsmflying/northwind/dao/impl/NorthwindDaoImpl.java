package fsmflying.northwind.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import fsmflying.northwind.dao.NorthwindDao;
import fsmflying.northwind.dm.Category;
import fsmflying.northwind.dm.Customer;
import fsmflying.northwind.dm.Shipper;
import fsmflying.northwind.dm.Supplier;

public class NorthwindDaoImpl implements NorthwindDao {

	private JdbcTemplate mJdbcTemplate = new JdbcTemplate();

	@Override
	public void setDataSource(DataSource ds) {
		this.mJdbcTemplate.setDataSource(ds);
	}

	@Override
	public boolean add(Category model) {
		this.mJdbcTemplate
				.update("insert into categories(categoryid,categoryName,description,picture) values(?,?,?,?)",
						model.getCategoryId(), model.getCategoryName(),
						model.getDescription(), model.getPicture());
		return true;
	}

	@Override
	public boolean deleteCategory(int id) {
		this.mJdbcTemplate.update("delete from categories where categoryId=?",
				id);
		return true;
	}

	@Override
	public boolean update(Category model) {
		this.mJdbcTemplate
				.update("update categories set categoryName=?,description=?,picture=? where categoryId=?",
						model.getCategoryName(), model.getDescription(),
						model.getPicture(), model.getCategoryId());
		return true;
	}

	static class CategoryMapper implements RowMapper<Category> {
		public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
			Category model = new Category();
			model.setCategoryId(rs.getInt("categoryId"));
			model.setCategoryName(rs.getString("categoryName"));
			model.setDescription(rs.getString("description"));
			model.setPicture(rs.getBytes("picture"));
			return model;
		}
	}

	@Override
	public Category getModelOfCategory(int id) {
		return this.mJdbcTemplate.queryForObject(
				"select * from categories where categoryid=?",
				new Object[] { id }, new CategoryMapper());
	}

	@Override
	public List<Category> getListOfCategory() {
		return this.mJdbcTemplate.query("select * from categories",
				new CategoryMapper());
	}

	@Override
	public int getMaxCategoryId() {
		return this.mJdbcTemplate.queryForObject(
				"select ifnull(max(categoryId),-1) from categories",
				Integer.class);
	}

	@Override
	public int getMinCategoryId() {
		return this.mJdbcTemplate.queryForObject(
				"select ifnull(min(categoryId),-1) from categories",
				Integer.class);
	}

	@Override
	public int getNextCategoryId() {
		return this.mJdbcTemplate.queryForObject(
				"select ifnull(min(categoryId),0)+1 from categories",
				Integer.class);
	}

	@Override
	public boolean add(Customer model) {
		this.mJdbcTemplate
				.update("insert into customers(customerId,companyName,contactName,contactTitle,address,city,region,postalCode,country,phone,fax values(?,?,?,?,?,?,?,?,?,?,?)",
						model.getCustomerId(), model.getCompanyName(),
						model.getContactName(), model.getContactTitle(),
						model.getAddress(), model.getCity(), model.getRegion(),
						model.getPostalCode(), model.getCountry(),
						model.getPhone(), model.getFax());
		return true;
	}

	@Override
	public boolean deleteCustomer(String id) {
		this.mJdbcTemplate.update("delete from customers where customerId=?",
				id);
		return true;
	}

	@Override
	public boolean update(Customer model) {
		this.mJdbcTemplate
				.update("udpate customers set companyName=?,contactName=?,contactTitle=?,address=?,city=?,region=?,"
						+ "postalCode=?,country=?,phone=?,fax=? where customerId=?",
						model.getCompanyName(), model.getContactName(),
						model.getContactTitle(), model.getAddress(),
						model.getCity(), model.getRegion(),
						model.getPostalCode(), model.getCountry(),
						model.getPhone(), model.getFax(), model.getCustomerId());
		return true;
	}

	static class CustomerMapper implements RowMapper<Customer> {
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer model = new Customer();
			model.setCustomerId(rs.getString("customerId"));
			model.setCompanyName(rs.getString("CompanyName"));
			model.setContactName(rs.getString("contactName"));
			model.setContactTitle(rs.getString("contactTitle"));
			model.setAddress(rs.getString("address"));
			model.setCity(rs.getString("city"));
			model.setRegion(rs.getString("region"));
			model.setPostalCode(rs.getString("postalCode"));
			model.setCountry(rs.getString("country"));
			model.setPhone(rs.getString("phone"));
			model.setFax(rs.getString("fax"));
			return model;
		}
	}

	@Override
	public Customer getModelOfCustomer(String id) {
		return this.mJdbcTemplate.queryForObject(
				"select * from customers where customerId=?",
				new Object[] { id }, new CustomerMapper());
	}

	@Override
	public List<Customer> getListOfCustomer() {
		return this.mJdbcTemplate.query("select * from customers",
				new CustomerMapper());
	}

	@Override
	public boolean add(Shipper model) {
		this.mJdbcTemplate
				.update("insert into shippers(shipperId,companyName,phone) values(?,?,?)",
						model.getShipperId(), model.getCompanyName(),
						model.getPhone());
		return true;
	}

	@Override
	public boolean deleteShipper(int id) {
		this.mJdbcTemplate.update("delete from shippers where shipperId=?", id);
		return true;
	}

	@Override
	public boolean update(Shipper model) {
		this.mJdbcTemplate.update(
				"udpate customers set companyName=?,phone=? where shipperId=?",
				model.getCompanyName(), model.getCompanyName(),
				model.getShipperId());
		return true;
	}

	static class ShipperMapper implements RowMapper<Shipper> {
		public Shipper mapRow(ResultSet rs, int rowNum) throws SQLException {
			Shipper model = new Shipper();
			model.setShipperId(rs.getInt("shipperId"));
			model.setCompanyName(rs.getString("CompanyName"));
			model.setPhone(rs.getString("phone"));
			return model;
		}
	}

	@Override
	public Shipper getModelOfShipper(int id) {
		return this.mJdbcTemplate.queryForObject(
				"select * from shippers where shipperId=?",
				new Object[] { id }, new ShipperMapper());
	}

	@Override
	public List<Shipper> getListOfShipper() {
		return this.mJdbcTemplate.query("select * from shippers",
				new ShipperMapper());
	}

	@Override
	public boolean add(Supplier model) {
		this.mJdbcTemplate
				.update("insert into suppliers(customerId,companyName,contactName,contactTitle,address,city,region,postalCode,country,phone,fax,homePage values(?,?,?,?,?,?,?,?,?,?,?,?)",
						model.getSupplierId(), model.getCompanyName(),
						model.getContactName(), model.getContactTitle(),
						model.getAddress(), model.getCity(), model.getRegion(),
						model.getPostalCode(), model.getCountry(),
						model.getPhone(), model.getFax(), model.getHomePage());
		return true;
	}

	@Override
	public boolean deleteSupplier(int id) {
		this.mJdbcTemplate.update("delete from suppliers where supplierId=?",
				id);
		return true;
	}

	@Override
	public boolean update(Supplier model) {
		this.mJdbcTemplate
				.update("udpate suppliers set companyName=?,contactName=?,contactTitle=?,address=?,city=?,region=?,"
						+ "postalCode=?,country=?,phone=?,fax=?,homePage=? where supplierId=?",
						model.getCompanyName(), model.getContactName(),
						model.getContactTitle(), model.getAddress(),
						model.getCity(), model.getRegion(),
						model.getPostalCode(), model.getCountry(),
						model.getPhone(), model.getFax(), model.getHomePage(),
						model.getSupplierId());
		return true;
	}

	static class SupplierMapper implements RowMapper<Supplier> {
		public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
			Supplier model = new Supplier();
			model.setSupplierId(rs.getInt("supplierId"));
			model.setCompanyName(rs.getString("CompanyName"));
			model.setContactName(rs.getString("contactName"));
			model.setContactTitle(rs.getString("contactTitle"));
			model.setAddress(rs.getString("address"));
			model.setCity(rs.getString("city"));
			model.setRegion(rs.getString("region"));
			model.setPostalCode(rs.getString("postalCode"));
			model.setCountry(rs.getString("country"));
			model.setPhone(rs.getString("phone"));
			model.setFax(rs.getString("fax"));
			model.setHomePage(rs.getString("homePage"));
			return model;
		}
	}

	@Override
	public Supplier getModelOfSupplier(int id) {
		return this.mJdbcTemplate.queryForObject(
				"select * from suppliers where supplierId=?",
				new Object[] { id }, new SupplierMapper());
	}

	@Override
	public List<Supplier> getListOfSupplier() {
		return this.mJdbcTemplate.query("select * from suppliers",
				new SupplierMapper());
	}

}
