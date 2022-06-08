package cn.edu.nchu.bookstore.entity;


public class Subcategory {

  private int id;
  private String subcategoryName;
  private int categoryId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getSubcategoryName() {
    return subcategoryName;
  }

  public void setSubcategoryName(String subcategoryName) {
    this.subcategoryName = subcategoryName;
  }


  public int getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }

}
