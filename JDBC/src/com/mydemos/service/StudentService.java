package com.mydemos.service;

import java.util.ArrayList;

import javax.swing.JTable;

import com.mydemos.dao.StudentDao;
import com.mydemos.pojo.Student;

//import demo.student.stud;

public class StudentService {

public static void main(String[] args) {

StudentDao dao=new StudentDao();
//ArrayList<Student> studList= dao.getAllStudents();

//Student student= dao.getStudentsById(1005);
//System.out.println(student);

/*for(Student student:studList)
{
System.out.println(student);

}*/


Student student=new Student();
student.setStudentId(1005);
student.setMarks(95);
student.setSem(6);


System.out.println(dao.updateStudent(student.getStudentId(), student));




}

}
