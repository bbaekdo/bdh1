package com.j2.w13.daopattern;

public class AddressbookTest {
 public static void main(String[] args) {
  StudentDao studentDao = new ImplementStudentDao();
  
  for (Student student : studentDao.getStudents()) {
    System.out.println("Student No." + student.getNum() + ", Name : " + student.getName());
  }
  System.out.println();
  
  System.out.println("I will change No.1");
  Student student = studentDao.getStudents().get(1);
  student.setName("SongJiHyo");
  studentDao.updateStudent(student);
  
  studentDao.getStudent(1);
  System.out.println("Student No." + student.getNum() + ", Name : " + student.getName());
  System.out.println();
  
  student = studentDao.getStudents().get(0);
  studentDao.getStudent(0);
  System.out.println("Student No." + student.getNum() + ", Name : " + student.getName());
  student = studentDao.getStudents().get(1);
  studentDao.getStudent(1);
  System.out.println("Student No." + student.getNum() + ", Name : " + student.getName());
  student = studentDao.getStudents().get(2);
  studentDao.getStudent(2);
  System.out.println("Student No." + student.getNum() + ", Name : " + student.getName());
  
  System.out.println();
  System.out.println("I will delete No.2");
  student = studentDao.getStudents().get(2);
  studentDao.removeStudent(student);
  
 }
}
