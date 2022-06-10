package cn.edu.nchu.bookstore.entity;


public class ReturnVO {

  private int id;
  private int orderId;
  private String returnReason;
  private String returnCreateTime;
  private double returnAmount;
  private String returnExpressNo;
  private String orderGeneratedId;
  private String orderState;
  private String orderCreateTime;
  private String orderPayTime;
  private double orderAmount;
  private int customerId;
  private String deliverNo;
  private String customerName;
  private String customerSex;
  private String customerEmail;
  private String customerAddress;
  private int accountId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }


  public String getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(String returnReason) {
    this.returnReason = returnReason;
  }


  public String getReturnCreateTime() {
    return returnCreateTime;
  }

  public void setReturnCreateTime(String returnCreateTime) {
    this.returnCreateTime = returnCreateTime;
  }


  public double getReturnAmount() {
    return returnAmount;
  }

  public void setReturnAmount(double returnAmount) {
    this.returnAmount = returnAmount;
  }


  public String getReturnExpressNo() {
    return returnExpressNo;
  }

  public void setReturnExpressNo(String returnExpressNo) {
    this.returnExpressNo = returnExpressNo;
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


  public String getDeliverNo() {
    return deliverNo;
  }

  public void setDeliverNo(String deliverNo) {
    this.deliverNo = deliverNo;
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


  public int getAccountId() {
    return accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

}
