package fsmflying.northwind.dm;

public class Category {
	private int categoryId;
	private String categoryName;
	private String description;
	private byte[] picture;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", description=" + description + "]";
	}
	
}
