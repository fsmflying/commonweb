
package fsmflying.northwind.dm;

import java.util.Date;


public class Employee{
	
	


	private int mEmployeeID;
	private String mLastName;
	private String mFirstName;
	private String mTitle;
	private String mTitleOfCourtesy;
	private Date mBirthDate;
	private Date mHireDate;
	private String mAddress;
	private String mCity;
	private String mRegion;
	private String mPostalCode;
	private String mCountry;
	private String mHomePhone;
	private String mExtension;
	private byte[] mPhoto;
	private String mNotes;
	private int mReportsTo;
	private String mPhotoPath;

	public int getEmployeeID(){
		 return this.mEmployeeID;
	}

	public void setEmployeeID(int employeeID){
		 this.mEmployeeID = employeeID ;
	}

	public String getLastName(){
		 return this.mLastName;
	}

	public void setLastName(String lastName){
		 this.mLastName = lastName ;
	}

	public String getFirstName(){
		 return this.mFirstName;
	}

	public void setFirstName(String firstName){
		 this.mFirstName = firstName ;
	}

	public String getTitle(){
		 return this.mTitle;
	}

	public void setTitle(String title){
		 this.mTitle = title ;
	}

	public String getTitleOfCourtesy(){
		 return this.mTitleOfCourtesy;
	}

	public void setTitleOfCourtesy(String titleOfCourtesy){
		 this.mTitleOfCourtesy = titleOfCourtesy ;
	}

	public Date getBirthDate(){
		 return this.mBirthDate;
	}

	public void setBirthDate(Date birthDate){
		 this.mBirthDate = birthDate ;
	}

	public Date getHireDate(){
		 return this.mHireDate;
	}

	public void setHireDate(Date hireDate){
		 this.mHireDate = hireDate ;
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

	public String getHomePhone(){
		 return this.mHomePhone;
	}

	public void setHomePhone(String homePhone){
		 this.mHomePhone = homePhone ;
	}

	public String getExtension(){
		 return this.mExtension;
	}

	public void setExtension(String extension){
		 this.mExtension = extension ;
	}

	public byte[] getPhoto(){
		 return this.mPhoto;
	}

	public void setPhoto(byte[] photo){
		 this.mPhoto = photo ;
	}

	public String getNotes(){
		 return this.mNotes;
	}

	public void setNotes(String notes){
		 this.mNotes = notes ;
	}

	public int getReportsTo(){
		 return this.mReportsTo;
	}

	public void setReportsTo(int reportsTo){
		 this.mReportsTo = reportsTo ;
	}

	public String getPhotoPath(){
		 return this.mPhotoPath;
	}

	public void setPhotoPath(String photoPath){
		 this.mPhotoPath = photoPath ;
	}


}
