package com.j2.w10.facade;

public class HomeStudyFacade {
  private Book book;
  private DeskLamp desklamp;
  private Timer timer;
  private Pens pens;
  private Laptop laptop;
  
  public HomeStudyFacade (Book book, DeskLamp desklamp, Timer timer, Pens pens, Laptop laptop) {
    this.book=book;
    this.desklamp=desklamp;
    this.timer=timer;
    this.pens=pens;
    this.laptop=laptop;
  }
  
  public void beginStudy(String bookname) {
    System.out.println("Now, get ready to study!");
    book.open(bookname);
    desklamp.on();
    desklamp.setLight(5);
    timer.on();
    timer.setTime();
    book.setPage(148);
    pens.openPencilcase();
    pens.writeNote();
    pens.highlight(7);
    laptop.on();
    laptop.searchAbout("Protein");
  }
  
  public void endStudy() {
    System.out.println("Study Done!!!!");
    book.close();
    desklamp.off();
    timer.stop();
    timer.checkTime();
    timer.off();
    pens.closePencilcase();
    laptop.off();
    System.out.println("I need to rest...");
  }
}