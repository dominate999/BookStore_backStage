package cn.edu.nchu.bookstore.entity;


public class Book {

  private int id;
  private String bookName;
  private String bookIsbn;
  private double bookPrice;
  private String publisher;
  private String bookAuthor;
  private String publishTime;
  private int bookStock;
  private String bookBlurb;
  private String bookPic;
  private int subcategoryId;
  private int saleAmount;

  public int getSaleAmount() {
    return saleAmount;
  }

  public void setSaleAmount(int saleAmount) {
    this.saleAmount = saleAmount;
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


  public int getBookStock() {
    return bookStock;
  }

  public void setBookStock(int bookStock) {
    this.bookStock = bookStock;
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


  public int getSubcategoryId() {
    return subcategoryId;
  }

  public void setSubcategoryId(int subcategoryId) {
    this.subcategoryId = subcategoryId;
  }

}
