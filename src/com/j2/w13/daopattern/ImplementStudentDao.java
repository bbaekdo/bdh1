package com.j2.w13.daopattern;
import java.util.ArrayList;
import java.util.List;

public class ImplementStudentDao implements StudentDao {
  List<Student> students;
  
  public ImplementStudentDao() {
    students = new ArrayList<Student>();
    Student s1 = new Student("BaekDoHyun", 0);
    Student s2 = new Student("HongGilDong", 1);
    Student s3 = new Student("KimSaRang", 2);
    students.add(s1);
    students.add(s2);
    students.add(s3);
  }
  
  public List<Student> getStudents() {
    return students;
  }

  public Student getStudent(int num) {
    return students.get(num);
  }
  
  public void updateStudent(Student student) {
    students.get(student.getNum()).setName(student.getName());
    System.out.println("Student No." + student.getNum() + " updated from db");
  }
  
  public void removeStudent(Student student) {
    students.remove(student.getNum());
    System.out.println("Student No." + student.getNum() + " deleted from db");
  }
  
}
