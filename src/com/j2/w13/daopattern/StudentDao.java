package com.j2.w13.daopattern;
import java.util.List; 

public interface StudentDao { 
  public List<Student> getStudents(); 
  public Student getStudent(int num); 
  public void updateStudent(Student student); 
  public void removeStudent(Student student); 
} 
