package cn.edu.nchu.bookstore.entity;


public class Evaluate {

  private int id;
  private String evaContent;
  private int evaStar;
  private String evaCreateTime;
  private String username;
  private int bookId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getEvaContent() {
    return evaContent;
  }

  public void setEvaContent(String evaContent) {
    this.evaContent = evaContent;
  }


  public int getEvaStar() {
    return evaStar;
  }

  public void setEvaStar(int evaStar) {
    this.evaStar = evaStar;
  }


  public String getEvaCreateTime() {
    return evaCreateTime;
  }

  public void setEvaCreateTime(String evaCreateTime) {
    this.evaCreateTime = evaCreateTime;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

}
