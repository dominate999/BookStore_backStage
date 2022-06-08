package cn.edu.nchu.bookstore.entity;


public class OrderVO {

  private String orderGeneratedId;
  private String orderState;
  private String orderCreateTime;
  private String orderPayTime;
  private double orderAmount;
  private String customerName;
  private String customerSex;
  private String customerEmail;
  private String customerAddress;
  private double orderItemAmount;
  private int bookQuantity;
  private int evaluateId;
  private int id;
  private String bookName;
  private String bookIsbn;
  private double bookPrice;
  private String publisher;
  private String bookAuthor;
  private String publishTime;
  private String bookBlurb;
  private String bookPic;
  private int bookId;
  private int customerId;
  private int bookStock;
  private int orderitemId;


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


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public String getBookIsbn() {
    return bookIsbn;
  }

  public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
  }


  public double getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(double bookPrice) {
    this.bookPrice = bookPrice;
  }


  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }


  public String getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(String publishTime) {
    this.publishTime = publishTime;
  }


  public String getBookBlurb() {
    return bookBlurb;
  }

  public void setBookBlurb(String bookBlurb) {
    this.bookBlurb = bookBlurb;
  }


  public String getBookPic() {
    return bookPic;
  }

  public void setBookPic(String bookPic) {
    this.bookPic = bookPic;
  }


  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }


  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }


  public int getBookStock() {
    return bookStock;
  }

  public void setBookStock(int bookStock) {
    this.bookStock = bookStock;
  }


  public int getOrderitemId() {
    return orderitemId;
  }

  public void setOrderitemId(int orderitemId) {
    this.orderitemId = orderitemId;
  }

}
