package cn.edu.nchu.bookstore.entity;


public class Orderitem {

  private int id;
  private int bookId;
  private double orderItemAmount;
  private int bookQuantity;
  private int evaluateId;
  private int orderId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }


  public double getOrderItemAmount() {
    return orderItemAmount;
  }

  public void setOrderItemAmount(double orderItemAmount) {
    this.orderItemAmount = orderItemAmount;
  }


  public int getBookQuantity() {
    return bookQuantity;
  }

  public void setBookQuantity(int bookQuantity) {
    this.bookQuantity = bookQuantity;
  }


  public int getEvaluateId() {
    return evaluateId;
  }

  public void setEvaluateId(int evaluateId) {
    this.evaluateId = evaluateId;
  }


  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

}
