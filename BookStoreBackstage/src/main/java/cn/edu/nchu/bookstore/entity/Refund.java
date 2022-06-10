package cn.edu.nchu.bookstore.entity;


public class Refund {

  private int id;
  private int orderId;
  private String refundCreateTime;
  private String refundReason;
  private double refundExpectAmount;


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

}
