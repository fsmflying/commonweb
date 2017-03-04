

package fsmflying.northwind.dm;

import java.util.Date;


public class Order{
	
	


	private int mOrderID;
	private String mCustomerID;
	private int mEmployeeID;
	private Date mOrderDate;
	private Date mRequiredDate;
	private Date mShippedDate;
	private int mShipVia;
	private int mFreight;
	private String mShipName;
	private String mShipAddress;
	private String mShipCity;
	private String mShipRegion;
	private String mShipPostalCode;
	private String mShipCountry;

	public int getOrderID(){
		 return this.mOrderID;
	}

	public void setOrderID(int orderID){
		 this.mOrderID = orderID ;
	}

	public String getCustomerID(){
		 return this.mCustomerID;
	}

	public void setCustomerID(String customerID){
		 this.mCustomerID = customerID ;
	}

	public int getEmployeeID(){
		 return this.mEmployeeID;
	}

	public void setEmployeeID(int employeeID){
		 this.mEmployeeID = employeeID ;
	}

	public Date getOrderDate(){
		 return this.mOrderDate;
	}

	public void setOrderDate(Date orderDate){
		 this.mOrderDate = orderDate ;
	}

	public Date getRequiredDate(){
		 return this.mRequiredDate;
	}

	public void setRequiredDate(Date requiredDate){
		 this.mRequiredDate = requiredDate ;
	}

	public Date getShippedDate(){
		 return this.mShippedDate;
	}

	public void setShippedDate(Date shippedDate){
		 this.mShippedDate = shippedDate ;
	}

	public int getShipVia(){
		 return this.mShipVia;
	}

	public void setShipVia(int shipVia){
		 this.mShipVia = shipVia ;
	}

	public int getFreight(){
		 return this.mFreight;
	}

	public void setFreight(int freight){
		 this.mFreight = freight ;
	}

	public String getShipName(){
		 return this.mShipName;
	}

	public void setShipName(String shipName){
		 this.mShipName = shipName ;
	}

	public String getShipAddress(){
		 return this.mShipAddress;
	}

	public void setShipAddress(String shipAddress){
		 this.mShipAddress = shipAddress ;
	}

	public String getShipCity(){
		 return this.mShipCity;
	}

	public void setShipCity(String shipCity){
		 this.mShipCity = shipCity ;
	}

	public String getShipRegion(){
		 return this.mShipRegion;
	}

	public void setShipRegion(String shipRegion){
		 this.mShipRegion = shipRegion ;
	}

	public String getShipPostalCode(){
		 return this.mShipPostalCode;
	}

	public void setShipPostalCode(String shipPostalCode){
		 this.mShipPostalCode = shipPostalCode ;
	}

	public String getShipCountry(){
		 return this.mShipCountry;
	}

	public void setShipCountry(String shipCountry){
		 this.mShipCountry = shipCountry ;
	}


}
