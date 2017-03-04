

package fsmflying.northwind.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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


public class NorthwindDaoImpl implements NorthwindDao{

	JdbcTemplate mJdbcTemplate = new JdbcTemplate();
	
	@Override
	public void setDataSource(DataSource ds) {
		this.mJdbcTemplate.setDataSource(ds);
	}
	


	@Override
	public boolean add(Order model){
		this.mJdbcTemplate
				.update("insert into orders(OrderID,CustomerID,EmployeeID,OrderDate,RequiredDate,ShippedDate,ShipVia,Freight,ShipName,ShipAddress,ShipCity,ShipRegion,ShipPostalCode,ShipCountry) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)", 
									model.getOrderID(),
						model.getCustomerID(),
						model.getEmployeeID(),
						model.getOrderDate(),
						model.getRequiredDate(),
						model.getShippedDate(),
						model.getShipVia(),
						model.getFreight(),
						model.getShipName(),
						model.getShipAddress(),
						model.getShipCity(),
						model.getShipRegion(),
						model.getShipPostalCode(),
						model.getShipCountry()

		);
		return true;
	}

	@Override
	public boolean save(Order model){
		this.mJdbcTemplate
				.update("update orders set CustomerID=?,EmployeeID=?,OrderDate=?,RequiredDate=?,ShippedDate=?,ShipVia=?,Freight=?,ShipName=?,ShipAddress=?,ShipCity=?,ShipRegion=?,ShipPostalCode=?,ShipCountry=? where 1=1 and OrderID=?" 
									,model.getCustomerID()
						,model.getEmployeeID()
						,model.getOrderDate()
						,model.getRequiredDate()
						,model.getShippedDate()
						,model.getShipVia()
						,model.getFreight()
						,model.getShipName()
						,model.getShipAddress()
						,model.getShipCity()
						,model.getShipRegion()
						,model.getShipPostalCode()
						,model.getShipCountry()
						,model.getOrderID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfOrder(int orderID){
		this.mJdbcTemplate.update("delete from  orders where  1=1 and OrderID=?",  orderID);
		return true;
	}
	
	class OrderMapper implements RowMapper<Order> {
		public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
			Order model = new Order();
				model.setOrderID(rs.getInt("OrderID"));
				model.setCustomerID(rs.getString("CustomerID"));
				model.setEmployeeID(rs.getInt("EmployeeID"));
				model.setOrderDate(rs.getDate("OrderDate"));
				model.setRequiredDate(rs.getDate("RequiredDate"));
				model.setShippedDate(rs.getDate("ShippedDate"));
				model.setShipVia(rs.getInt("ShipVia"));
				model.setFreight(rs.getInt("Freight"));
				model.setShipName(rs.getString("ShipName"));
				model.setShipAddress(rs.getString("ShipAddress"));
				model.setShipCity(rs.getString("ShipCity"));
				model.setShipRegion(rs.getString("ShipRegion"));
				model.setShipPostalCode(rs.getString("ShipPostalCode"));
				model.setShipCountry(rs.getString("ShipCountry"));

			return model;
		}
	}
	
	@Override
	public Order getModelOfOrder(int orderID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from orders where  1=1 and OrderID=?", new Object[] {  orderID },
				new OrderMapper());
	}
	
	@Override
	public List<Order> getListOfOrder() {
		return this.mJdbcTemplate.query("select * from orders",
				new OrderMapper());
	}
	


	@Override
	public boolean add(OrderDetail model){
		this.mJdbcTemplate
				.update("insert into orderdetails(OrderID,ProductID,UnitPrice,Quantity,Discount) values(?,?,?,?,?)", 
									model.getOrderID(),
						model.getProductID(),
						model.getUnitPrice(),
						model.getQuantity(),
						model.getDiscount()

		);
		return true;
	}

	@Override
	public boolean save(OrderDetail model){
		this.mJdbcTemplate
				.update("update orderdetails set UnitPrice=?,Quantity=?,Discount=? where 1=1 and OrderID=? and ProductID=?" 
									,model.getUnitPrice()
						,model.getQuantity()
						,model.getDiscount()
						,model.getOrderID()
						,model.getProductID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfOrderDetail(int orderID,int productID){
		this.mJdbcTemplate.update("delete from  orderdetails where  1=1 and OrderID=? and ProductID=?",  orderID, productID);
		return true;
	}
	
	class OrderDetailMapper implements RowMapper<OrderDetail> {
		public OrderDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
			OrderDetail model = new OrderDetail();
				model.setOrderID(rs.getInt("OrderID"));
				model.setProductID(rs.getInt("ProductID"));
				model.setUnitPrice(rs.getDouble("UnitPrice"));
				model.setQuantity(rs.getInt("Quantity"));
				model.setDiscount(rs.getDouble("Discount"));

			return model;
		}
	}
	
	@Override
	public OrderDetail getModelOfOrderDetail(int orderID,int productID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from orderdetails where  1=1 and OrderID=? and ProductID=?", new Object[] {  orderID, productID },
				new OrderDetailMapper());
	}
	
	@Override
	public List<OrderDetail> getListOfOrderDetail() {
		return this.mJdbcTemplate.query("select * from orderdetails",
				new OrderDetailMapper());
	}
	


	@Override
	public boolean add(Category model){
		this.mJdbcTemplate
				.update("insert into categories(CategoryID,CategoryName,Description,Picture) values(?,?,?,?)", 
									model.getCategoryID(),
						model.getCategoryName(),
						model.getDescription(),
						model.getPicture()

		);
		return true;
	}

	@Override
	public boolean save(Category model){
		this.mJdbcTemplate
				.update("update categories set CategoryName=?,Description=?,Picture=? where 1=1 and CategoryID=?" 
									,model.getCategoryName()
						,model.getDescription()
						,model.getPicture()
						,model.getCategoryID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfCategory(int categoryID){
		this.mJdbcTemplate.update("delete from  categories where  1=1 and CategoryID=?",  categoryID);
		return true;
	}
	
	class CategoryMapper implements RowMapper<Category> {
		public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
			Category model = new Category();
				model.setCategoryID(rs.getInt("CategoryID"));
				model.setCategoryName(rs.getString("CategoryName"));
				model.setDescription(rs.getString("Description"));
				model.setPicture(rs.getBytes("Picture"));

			return model;
		}
	}
	
	@Override
	public Category getModelOfCategory(int categoryID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from categories where  1=1 and CategoryID=?", new Object[] {  categoryID },
				new CategoryMapper());
	}
	
	@Override
	public List<Category> getListOfCategory() {
		return this.mJdbcTemplate.query("select * from categories",
				new CategoryMapper());
	}
	


	@Override
	public boolean add(Employee model){
		this.mJdbcTemplate
				.update("insert into employees(EmployeeID,LastName,FirstName,Title,TitleOfCourtesy,BirthDate,HireDate,Address,City,Region,PostalCode,Country,HomePhone,Extension,Photo,Notes,ReportsTo,PhotoPath) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", 
									model.getEmployeeID(),
						model.getLastName(),
						model.getFirstName(),
						model.getTitle(),
						model.getTitleOfCourtesy(),
						model.getBirthDate(),
						model.getHireDate(),
						model.getAddress(),
						model.getCity(),
						model.getRegion(),
						model.getPostalCode(),
						model.getCountry(),
						model.getHomePhone(),
						model.getExtension(),
						model.getPhoto(),
						model.getNotes(),
						model.getReportsTo(),
						model.getPhotoPath()

		);
		return true;
	}

	@Override
	public boolean save(Employee model){
		this.mJdbcTemplate
				.update("update employees set LastName=?,FirstName=?,Title=?,TitleOfCourtesy=?,BirthDate=?,HireDate=?,Address=?,City=?,Region=?,PostalCode=?,Country=?,HomePhone=?,Extension=?,Photo=?,Notes=?,ReportsTo=?,PhotoPath=? where 1=1 and EmployeeID=?" 
									,model.getLastName()
						,model.getFirstName()
						,model.getTitle()
						,model.getTitleOfCourtesy()
						,model.getBirthDate()
						,model.getHireDate()
						,model.getAddress()
						,model.getCity()
						,model.getRegion()
						,model.getPostalCode()
						,model.getCountry()
						,model.getHomePhone()
						,model.getExtension()
						,model.getPhoto()
						,model.getNotes()
						,model.getReportsTo()
						,model.getPhotoPath()
						,model.getEmployeeID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfEmployee(int employeeID){
		this.mJdbcTemplate.update("delete from  employees where  1=1 and EmployeeID=?",  employeeID);
		return true;
	}
	
	class EmployeeMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee model = new Employee();
				model.setEmployeeID(rs.getInt("EmployeeID"));
				model.setLastName(rs.getString("LastName"));
				model.setFirstName(rs.getString("FirstName"));
				model.setTitle(rs.getString("Title"));
				model.setTitleOfCourtesy(rs.getString("TitleOfCourtesy"));
				model.setBirthDate(rs.getDate("BirthDate"));
				model.setHireDate(rs.getDate("HireDate"));
				model.setAddress(rs.getString("Address"));
				model.setCity(rs.getString("City"));
				model.setRegion(rs.getString("Region"));
				model.setPostalCode(rs.getString("PostalCode"));
				model.setCountry(rs.getString("Country"));
				model.setHomePhone(rs.getString("HomePhone"));
				model.setExtension(rs.getString("Extension"));
				model.setPhoto(rs.getBytes("Photo"));
				model.setNotes(rs.getString("Notes"));
				model.setReportsTo(rs.getInt("ReportsTo"));
				model.setPhotoPath(rs.getString("PhotoPath"));

			return model;
		}
	}
	
	@Override
	public Employee getModelOfEmployee(int employeeID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from employees where  1=1 and EmployeeID=?", new Object[] {  employeeID },
				new EmployeeMapper());
	}
	
	@Override
	public List<Employee> getListOfEmployee() {
		return this.mJdbcTemplate.query("select * from employees",
				new EmployeeMapper());
	}
	


	@Override
	public boolean add(Product model){
		this.mJdbcTemplate
				.update("insert into products(ProductID,ProductName,SupplierID,CategoryID,QuantityPerUnit,UnitPrice,UnitsInStock,UnitsOnOrder,ReorderLevel,Discontinued) values(?,?,?,?,?,?,?,?,?,?)", 
									model.getProductID(),
						model.getProductName(),
						model.getSupplierID(),
						model.getCategoryID(),
						model.getQuantityPerUnit(),
						model.getUnitPrice(),
						model.getUnitsInStock(),
						model.getUnitsOnOrder(),
						model.getReorderLevel(),
						model.getDiscontinued()

		);
		return true;
	}

	@Override
	public boolean save(Product model){
		this.mJdbcTemplate
				.update("update products set ProductName=?,SupplierID=?,CategoryID=?,QuantityPerUnit=?,UnitPrice=?,UnitsInStock=?,UnitsOnOrder=?,ReorderLevel=?,Discontinued=? where 1=1 and ProductID=?" 
									,model.getProductName()
						,model.getSupplierID()
						,model.getCategoryID()
						,model.getQuantityPerUnit()
						,model.getUnitPrice()
						,model.getUnitsInStock()
						,model.getUnitsOnOrder()
						,model.getReorderLevel()
						,model.getDiscontinued()
						,model.getProductID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfProduct(int productID){
		this.mJdbcTemplate.update("delete from  products where  1=1 and ProductID=?",  productID);
		return true;
	}
	
	class ProductMapper implements RowMapper<Product> {
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product model = new Product();
				model.setProductID(rs.getInt("ProductID"));
				model.setProductName(rs.getString("ProductName"));
				model.setSupplierID(rs.getInt("SupplierID"));
				model.setCategoryID(rs.getInt("CategoryID"));
				model.setQuantityPerUnit(rs.getString("QuantityPerUnit"));
				model.setUnitPrice(rs.getInt("UnitPrice"));
				model.setUnitsInStock(rs.getInt("UnitsInStock"));
				model.setUnitsOnOrder(rs.getInt("UnitsOnOrder"));
				model.setReorderLevel(rs.getInt("ReorderLevel"));
				model.setDiscontinued(rs.getString("Discontinued"));

			return model;
		}
	}
	
	@Override
	public Product getModelOfProduct(int productID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from products where  1=1 and ProductID=?", new Object[] {  productID },
				new ProductMapper());
	}
	
	@Override
	public List<Product> getListOfProduct() {
		return this.mJdbcTemplate.query("select * from products",
				new ProductMapper());
	}
	


	@Override
	public boolean add(Shipper model){
		this.mJdbcTemplate
				.update("insert into shippers(ShipperID,CompanyName,Phone) values(?,?,?)", 
									model.getShipperID(),
						model.getCompanyName(),
						model.getPhone()

		);
		return true;
	}

	@Override
	public boolean save(Shipper model){
		this.mJdbcTemplate
				.update("update shippers set CompanyName=?,Phone=? where 1=1 and ShipperID=?" 
									,model.getCompanyName()
						,model.getPhone()
						,model.getShipperID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfShipper(int shipperID){
		this.mJdbcTemplate.update("delete from  shippers where  1=1 and ShipperID=?",  shipperID);
		return true;
	}
	
	class ShipperMapper implements RowMapper<Shipper> {
		public Shipper mapRow(ResultSet rs, int rowNum) throws SQLException {
			Shipper model = new Shipper();
				model.setShipperID(rs.getInt("ShipperID"));
				model.setCompanyName(rs.getString("CompanyName"));
				model.setPhone(rs.getString("Phone"));

			return model;
		}
	}
	
	@Override
	public Shipper getModelOfShipper(int shipperID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from shippers where  1=1 and ShipperID=?", new Object[] {  shipperID },
				new ShipperMapper());
	}
	
	@Override
	public List<Shipper> getListOfShipper() {
		return this.mJdbcTemplate.query("select * from shippers",
				new ShipperMapper());
	}
	


	@Override
	public boolean add(Supplier model){
		this.mJdbcTemplate
				.update("insert into suppliers(SupplierID,CompanyName,ContactName,ContactTitle,Address,City,Region,PostalCode,Country,Phone,Fax,HomePage) values(?,?,?,?,?,?,?,?,?,?,?,?)", 
									model.getSupplierID(),
						model.getCompanyName(),
						model.getContactName(),
						model.getContactTitle(),
						model.getAddress(),
						model.getCity(),
						model.getRegion(),
						model.getPostalCode(),
						model.getCountry(),
						model.getPhone(),
						model.getFax(),
						model.getHomePage()

		);
		return true;
	}

	@Override
	public boolean save(Supplier model){
		this.mJdbcTemplate
				.update("update suppliers set CompanyName=?,ContactName=?,ContactTitle=?,Address=?,City=?,Region=?,PostalCode=?,Country=?,Phone=?,Fax=?,HomePage=? where 1=1 and SupplierID=?" 
									,model.getCompanyName()
						,model.getContactName()
						,model.getContactTitle()
						,model.getAddress()
						,model.getCity()
						,model.getRegion()
						,model.getPostalCode()
						,model.getCountry()
						,model.getPhone()
						,model.getFax()
						,model.getHomePage()
						,model.getSupplierID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfSupplier(int supplierID){
		this.mJdbcTemplate.update("delete from  suppliers where  1=1 and SupplierID=?",  supplierID);
		return true;
	}
	
	class SupplierMapper implements RowMapper<Supplier> {
		public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
			Supplier model = new Supplier();
				model.setSupplierID(rs.getInt("SupplierID"));
				model.setCompanyName(rs.getString("CompanyName"));
				model.setContactName(rs.getString("ContactName"));
				model.setContactTitle(rs.getString("ContactTitle"));
				model.setAddress(rs.getString("Address"));
				model.setCity(rs.getString("City"));
				model.setRegion(rs.getString("Region"));
				model.setPostalCode(rs.getString("PostalCode"));
				model.setCountry(rs.getString("Country"));
				model.setPhone(rs.getString("Phone"));
				model.setFax(rs.getString("Fax"));
				model.setHomePage(rs.getString("HomePage"));

			return model;
		}
	}
	
	@Override
	public Supplier getModelOfSupplier(int supplierID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from suppliers where  1=1 and SupplierID=?", new Object[] {  supplierID },
				new SupplierMapper());
	}
	
	@Override
	public List<Supplier> getListOfSupplier() {
		return this.mJdbcTemplate.query("select * from suppliers",
				new SupplierMapper());
	}
	


	@Override
	public boolean add(Customer model){
		this.mJdbcTemplate
				.update("insert into customers(CustomerID,CompanyName,ContactName,ContactTitle,Address,City,Region,PostalCode,Country,Phone,Fax) values(?,?,?,?,?,?,?,?,?,?,?)", 
									model.getCustomerID(),
						model.getCompanyName(),
						model.getContactName(),
						model.getContactTitle(),
						model.getAddress(),
						model.getCity(),
						model.getRegion(),
						model.getPostalCode(),
						model.getCountry(),
						model.getPhone(),
						model.getFax()

		);
		return true;
	}

	@Override
	public boolean save(Customer model){
		this.mJdbcTemplate
				.update("update customers set CompanyName=?,ContactName=?,ContactTitle=?,Address=?,City=?,Region=?,PostalCode=?,Country=?,Phone=?,Fax=? where 1=1 and CustomerID=?" 
									,model.getCompanyName()
						,model.getContactName()
						,model.getContactTitle()
						,model.getAddress()
						,model.getCity()
						,model.getRegion()
						,model.getPostalCode()
						,model.getCountry()
						,model.getPhone()
						,model.getFax()
						,model.getCustomerID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfCustomer(String customerID){
		this.mJdbcTemplate.update("delete from  customers where  1=1 and CustomerID=?",  customerID);
		return true;
	}
	
	class CustomerMapper implements RowMapper<Customer> {
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer model = new Customer();
				model.setCustomerID(rs.getString("CustomerID"));
				model.setCompanyName(rs.getString("CompanyName"));
				model.setContactName(rs.getString("ContactName"));
				model.setContactTitle(rs.getString("ContactTitle"));
				model.setAddress(rs.getString("Address"));
				model.setCity(rs.getString("City"));
				model.setRegion(rs.getString("Region"));
				model.setPostalCode(rs.getString("PostalCode"));
				model.setCountry(rs.getString("Country"));
				model.setPhone(rs.getString("Phone"));
				model.setFax(rs.getString("Fax"));

			return model;
		}
	}
	
	@Override
	public Customer getModelOfCustomer(String customerID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from customers where  1=1 and CustomerID=?", new Object[] {  customerID },
				new CustomerMapper());
	}
	
	@Override
	public List<Customer> getListOfCustomer() {
		return this.mJdbcTemplate.query("select * from customers",
				new CustomerMapper());
	}
	


	@Override
	public boolean add(Region model){
		this.mJdbcTemplate
				.update("insert into region(RegionID,RegionDescription) values(?,?)", 
									model.getRegionID(),
						model.getRegionDescription()

		);
		return true;
	}

	@Override
	public boolean save(Region model){
		this.mJdbcTemplate
				.update("update region set RegionDescription=? where 1=1 and RegionID=?" 
									,model.getRegionDescription()
						,model.getRegionID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfRegion(int regionID){
		this.mJdbcTemplate.update("delete from  region where  1=1 and RegionID=?",  regionID);
		return true;
	}
	
	class RegionMapper implements RowMapper<Region> {
		public Region mapRow(ResultSet rs, int rowNum) throws SQLException {
			Region model = new Region();
				model.setRegionID(rs.getInt("RegionID"));
				model.setRegionDescription(rs.getString("RegionDescription"));

			return model;
		}
	}
	
	@Override
	public Region getModelOfRegion(int regionID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from region where  1=1 and RegionID=?", new Object[] {  regionID },
				new RegionMapper());
	}
	
	@Override
	public List<Region> getListOfRegion() {
		return this.mJdbcTemplate.query("select * from region",
				new RegionMapper());
	}
	


	@Override
	public boolean add(Territory model){
		this.mJdbcTemplate
				.update("insert into territories(TerritoryID,TerritoryDescription,RegionID) values(?,?,?)", 
									model.getTerritoryID(),
						model.getTerritoryDescription(),
						model.getRegionID()

		);
		return true;
	}

	@Override
	public boolean save(Territory model){
		this.mJdbcTemplate
				.update("update territories set TerritoryDescription=?,RegionID=? where 1=1 and TerritoryID=?" 
									,model.getTerritoryDescription()
						,model.getRegionID()
						,model.getTerritoryID()

		);
		return true;
	}
	
	@Override
	public boolean deleteModelOfTerritory(String territoryID){
		this.mJdbcTemplate.update("delete from  territories where  1=1 and TerritoryID=?",  territoryID);
		return true;
	}
	
	class TerritoryMapper implements RowMapper<Territory> {
		public Territory mapRow(ResultSet rs, int rowNum) throws SQLException {
			Territory model = new Territory();
				model.setTerritoryID(rs.getString("TerritoryID"));
				model.setTerritoryDescription(rs.getString("TerritoryDescription"));
				model.setRegionID(rs.getInt("RegionID"));

			return model;
		}
	}
	
	@Override
	public Territory getModelOfTerritory(String territoryID) {
		return this.mJdbcTemplate.queryForObject(
				"select * from territories where  1=1 and TerritoryID=?", new Object[] {  territoryID },
				new TerritoryMapper());
	}
	
	@Override
	public List<Territory> getListOfTerritory() {
		return this.mJdbcTemplate.query("select * from territories",
				new TerritoryMapper());
	}
	

}

