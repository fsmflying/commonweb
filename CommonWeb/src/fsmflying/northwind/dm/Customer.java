
package fsmflying.northwind.dm;


public class Customer{
	
	


	private String mCustomerID;
	private String mCompanyName;
	private String mContactName;
	private String mContactTitle;
	private String mAddress;
	private String mCity;
	private String mRegion;
	private String mPostalCode;
	private String mCountry;
	private String mPhone;
	private String mFax;

	public String getCustomerID(){
		 return this.mCustomerID;
	}

	public void setCustomerID(String customerID){
		 this.mCustomerID = customerID ;
	}

	public String getCompanyName(){
		 return this.mCompanyName;
	}

	public void setCompanyName(String companyName){
		 this.mCompanyName = companyName ;
	}

	public String getContactName(){
		 return this.mContactName;
	}

	public void setContactName(String contactName){
		 this.mContactName = contactName ;
	}

	public String getContactTitle(){
		 return this.mContactTitle;
	}

	public void setContactTitle(String contactTitle){
		 this.mContactTitle = contactTitle ;
	}

	public String getAddress(){
		 return this.mAddress;
	}

	public void setAddress(String address){
		 this.mAddress = address ;
	}

	public String getCity(){
		 return this.mCity;
	}

	public void setCity(String city){
		 this.mCity = city ;
	}

	public String getRegion(){
		 return this.mRegion;
	}

	public void setRegion(String region){
		 this.mRegion = region ;
	}

	public String getPostalCode(){
		 return this.mPostalCode;
	}

	public void setPostalCode(String postalCode){
		 this.mPostalCode = postalCode ;
	}

	public String getCountry(){
		 return this.mCountry;
	}

	public void setCountry(String country){
		 this.mCountry = country ;
	}

	public String getPhone(){
		 return this.mPhone;
	}

	public void setPhone(String phone){
		 this.mPhone = phone ;
	}

	public String getFax(){
		 return this.mFax;
	}

	public void setFax(String fax){
		 this.mFax = fax ;
	}


}
