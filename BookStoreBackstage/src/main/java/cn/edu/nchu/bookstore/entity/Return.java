package cn.edu.nchu.bookstore.entity;


public class Return {

  private int id;
  private int orderId;
  private String returnReason;
  private String returnCreateTime;
  private double returnAmount;
  private String returnExpressNo;


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

}
