package cn.edu.nchu.bookstore.entity;


public class Order {

  private int id;
  private String orderGeneratedId;
  private String orderState;
  private String orderCreateTime;
  private String orderPayTime;
  private double orderAmount;
  private int customerId;
  private String deliver_no;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getOrderGeneratedId() {
    return orderGeneratedId;
  }

  public void setOrderGeneratedId(String orderGeneratedId) {
    this.orderGeneratedId = orderGeneratedId;
  }


  public String getOrderState() {
    return orderState;
  }

  public void setOrderState(String orderState) {
    this.orderState = orderState;
  }


  public String getOrderCreateTime() {
    return orderCreateTime;
  }

  public void setOrderCreateTime(String orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
  }


  public String getOrderPayTime() {
    return orderPayTime;
  }

  public void setOrderPayTime(String orderPayTime) {
    this.orderPayTime = orderPayTime;
  }


  public double getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(double orderAmount) {
    this.orderAmount = orderAmount;
  }


  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }


  public String getDeliver_no() {
    return deliver_no;
  }

  public void setDeliver_no(String deliver_no) {
    this.deliver_no = deliver_no;
  }
}
