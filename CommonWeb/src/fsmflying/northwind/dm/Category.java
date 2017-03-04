
package fsmflying.northwind.dm;


public class Category{

	private int mCategoryID;
	private String mCategoryName;
	private String mDescription;
	private byte[] mPicture;

	public int getCategoryID(){
		 return this.mCategoryID;
	}

	public void setCategoryID(int categoryID){
		 this.mCategoryID = categoryID ;
	}

	public String getCategoryName(){
		 return this.mCategoryName;
	}

	public void setCategoryName(String categoryName){
		 this.mCategoryName = categoryName ;
	}

	public String getDescription(){
		 return this.mDescription;
	}

	public void setDescription(String description){
		 this.mDescription = description ;
	}

	public byte[] getPicture(){
		 return this.mPicture;
	}

	public void setPicture(byte[] picture){
		 this.mPicture = picture ;
	}


}
