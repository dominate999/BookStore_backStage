package cn.edu.nchu.bookstore.entity;


public class BookVO {

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
  private String categoryName;
  private String subcategoryName;


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


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public String getSubcategoryName() {
    return subcategoryName;
  }

  public void setSubcategoryName(String subcategoryName) {
    this.subcategoryName = subcategoryName;
  }


  @Override
  public String toString() {
    return "BookVO{" +
            "id=" + id +
            ", bookName='" + bookName + '\'' +
            ", bookIsbn='" + bookIsbn + '\'' +
            ", bookPrice=" + bookPrice +
            ", publisher='" + publisher + '\'' +
            ", bookAuthor='" + bookAuthor + '\'' +
            ", publishTime='" + publishTime + '\'' +
            ", bookStock=" + bookStock +
            ", bookBlurb='" + bookBlurb + '\'' +
            ", bookPic='" + bookPic + '\'' +
            ", categoryName='" + categoryName + '\'' +
            ", subcategoryName='" + subcategoryName + '\'' +
            '}';
  }
}
