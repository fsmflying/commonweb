
package fsmflying.northwind.dm;


public class Shipper{
	
	


	private int mShipperID;
	private String mCompanyName;
	private String mPhone;

	public int getShipperID(){
		 return this.mShipperID;
	}

	public void setShipperID(int shipperID){
		 this.mShipperID = shipperID ;
	}

	public String getCompanyName(){
		 return this.mCompanyName;
	}

	public void setCompanyName(String companyName){
		 this.mCompanyName = companyName ;
	}

	public String getPhone(){
		 return this.mPhone;
	}

	public void setPhone(String phone){
		 this.mPhone = phone ;
	}


}
