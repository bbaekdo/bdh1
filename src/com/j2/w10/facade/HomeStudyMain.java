package com.j2.w10.facade;

public class HomeStudyMain {
  public static void main(String[] args) {
    Book book = new Book();
    DeskLamp desklamp = new DeskLamp();
    Timer timer = new Timer();
    Pens pens = new Pens();
    Laptop laptop = new Laptop();
    
    HomeStudyFacade homestudy = new HomeStudyFacade(book,desklamp,timer,pens,laptop);
    homestudy.beginStudy("Java Programming");
    homestudy.endStudy();                              
  }
}