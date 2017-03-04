
package fsmflying.northwind.dm;


public class Product{
	
	


	private int mProductID;
	private String mProductName;
	private int mSupplierID;
	private int mCategoryID;
	private String mQuantityPerUnit;
	private int mUnitPrice;
	private int mUnitsInStock;
	private int mUnitsOnOrder;
	private int mReorderLevel;
	private String mDiscontinued;

	public int getProductID(){
		 return this.mProductID;
	}

	public void setProductID(int productID){
		 this.mProductID = productID ;
	}

	public String getProductName(){
		 return this.mProductName;
	}

	public void setProductName(String productName){
		 this.mProductName = productName ;
	}

	public int getSupplierID(){
		 return this.mSupplierID;
	}

	public void setSupplierID(int supplierID){
		 this.mSupplierID = supplierID ;
	}

	public int getCategoryID(){
		 return this.mCategoryID;
	}

	public void setCategoryID(int categoryID){
		 this.mCategoryID = categoryID ;
	}

	public String getQuantityPerUnit(){
		 return this.mQuantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit){
		 this.mQuantityPerUnit = quantityPerUnit ;
	}

	public int getUnitPrice(){
		 return this.mUnitPrice;
	}

	public void setUnitPrice(int unitPrice){
		 this.mUnitPrice = unitPrice ;
	}

	public int getUnitsInStock(){
		 return this.mUnitsInStock;
	}

	public void setUnitsInStock(int unitsInStock){
		 this.mUnitsInStock = unitsInStock ;
	}

	public int getUnitsOnOrder(){
		 return this.mUnitsOnOrder;
	}

	public void setUnitsOnOrder(int unitsOnOrder){
		 this.mUnitsOnOrder = unitsOnOrder ;
	}

	public int getReorderLevel(){
		 return this.mReorderLevel;
	}

	public void setReorderLevel(int reorderLevel){
		 this.mReorderLevel = reorderLevel ;
	}

	public String getDiscontinued(){
		 return this.mDiscontinued;
	}

	public void setDiscontinued(String discontinued){
		 this.mDiscontinued = discontinued ;
	}


}
