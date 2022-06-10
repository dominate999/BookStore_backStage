package cn.edu.nchu.bookstore.entity;


public class RefundVO {

  private String refundCreateTime;
  private String refundReason;
  private double refundExpectAmount;
  private String orderGeneratedId;
  private String orderState;
  private String orderCreateTime;
  private String orderPayTime;
  private double orderAmount;
  private String customerName;
  private String customerSex;
  private String customerEmail;
  private String customerAddress;
  private int orderId;
  private int accountId;


  public String getRefundCreateTime() {
    return refundCreateTime;
  }

  public void setRefundCreateTime(String refundCreateTime) {
    this.refundCreateTime = refundCreateTime;
  }


  public String getRefundReason() {
    return refundReason;
  }

  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }


  public double getRefundExpectAmount() {
    return refundExpectAmount;
  }

  public void setRefundExpectAmount(double refundExpectAmount) {
    this.refundExpectAmount = refundExpectAmount;
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


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public String getCustomerSex() {
    return customerSex;
  }

  public void setCustomerSex(String customerSex) {
    this.customerSex = customerSex;
  }


  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }


  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }


  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }


  public int getAccountId() {
    return accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

}
