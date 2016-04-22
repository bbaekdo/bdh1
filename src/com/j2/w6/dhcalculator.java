package com.j2.w6;
import java.util.Scanner;

class Calculation {
  int addition(int a, int b) {
    int c = a+b;
    return c;
  } 
  int subtraction(int a, int b) {
    int c = a-b;
    return c;
  } 
  int multiplication(int a, int b) {
    int c = a*b;
    return c;
  } 
  int division(int a, int b) {
    int c = a/b;
    return c;
  }
  int square(int a, int b) {
    int c = 1;
    for (int i=1; i<=b; i++) {
      c *= a;
    }
    return c;
    }
} 


public class dhcalculator {
  public static void main(String [] args) {
    Scanner a = new Scanner(System.in);
    boolean flag = true;
    System.out.println("Choose two operands");
    int operand1=a.nextInt();
    int operand2=a.nextInt();
    int calresult;
    while (flag) {
      Calculation c = new Calculation();
      System.out.print("Addition[+] (1) , Subtraction[-] (2) , Multiplication[*] (3) , Division[/] (4) , Square[^] (5) , End (6)");
      int operation = a.nextInt();
      try {
        if (operation < 1 || operation > 6)
          throw new Exception();
      } catch (Exception e) {
        System.out.println("Choose again please.");
      }
      switch(operation) {
        case 1:
          calresult=c.addition(operand1,operand2);
          System.out.println(operand1 +" + "+ operand2 +" = "+calresult);
          break;
        case 2:
          calresult=c.subtraction(operand1,operand2);
          System.out.println(operand1 +" - "+ operand2 +" = "+calresult);
          break;
        case 3:
          calresult=c.multiplication(operand1,operand2);
          System.out.println(operand1 +" * "+ operand2 +" = "+calresult);
          break;
        case 4:
          calresult=c.division(operand1,operand2);
          System.out.println(operand1 +" / "+ operand2 +" = "+calresult);
          break;
        case 5:
          calresult=c.square(operand1,operand2);
          System.out.println(operand1 +" ^ "+ operand2 +" = "+calresult);
          break;
        case 6:
          System.out.println("Exit");
          flag=false;
    }
  }
}
}