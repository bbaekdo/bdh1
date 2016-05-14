package com.j2.w10.facade;

public class Book {
  String bookname;
  public void open(String bookname) {
    System.out.println("Open your book : "+bookname);
  }
  public void setPage(int bookpage) {
    System.out.println("Open to page "+bookpage);
  }
  public void close() {
    System.out.println("Close your book.");
  }
}