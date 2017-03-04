
package fsmflying.northwind.dm;


public class OrderDetail{
	
	


	private int mOrderID;
	private int mProductID;
	private double mUnitPrice;
	private int mQuantity;
	private double mDiscount;

	public int getOrderID(){
		 return this.mOrderID;
	}

	public void setOrderID(int orderID){
		 this.mOrderID = orderID ;
	}

	public int getProductID(){
		 return this.mProductID;
	}

	public void setProductID(int productID){
		 this.mProductID = productID ;
	}

	public double getUnitPrice(){
		 return this.mUnitPrice;
	}

	public void setUnitPrice(double unitPrice){
		 this.mUnitPrice = unitPrice ;
	}

	public int getQuantity(){
		 return this.mQuantity;
	}

	public void setQuantity(int quantity){
		 this.mQuantity = quantity ;
	}

	public double getDiscount(){
		 return this.mDiscount;
	}

	public void setDiscount(double discount){
		 this.mDiscount = discount ;
	}


}
