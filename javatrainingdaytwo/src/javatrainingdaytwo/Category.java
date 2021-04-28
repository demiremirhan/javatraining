package javatrainingdaytwo;

public class Category {
	private int categoryId;
	private String categoryName;
	private String categoryType;


	public Category (int categoryId, String categoryName , String categoryType ) {
		this.categoryId=categoryId;
		this.categoryName=categoryName;
		this.categoryType=categoryType;

}
	
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

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
}
