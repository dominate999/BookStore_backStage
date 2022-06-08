package cn.edu.nchu.bookstore.entity;


public class Cart {

  private int id;
  private int customerId;
  private int bookId;
  private int cartQuantity;
  private double cartAmount;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }


  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }


  public int getCartQuantity() {
    return cartQuantity;
  }

  public void setCartQuantity(int cartQuantity) {
    this.cartQuantity = cartQuantity;
  }


  public double getCartAmount() {
    return cartAmount;
  }

  public void setCartAmount(double cartAmount) {
    this.cartAmount = cartAmount;
  }

}
