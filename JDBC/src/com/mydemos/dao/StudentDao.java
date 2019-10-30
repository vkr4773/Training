package com.mydemos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mydemos.dbutil.DbConn;
import com.mydemos.pojo.Student;

public class StudentDao {

public String saveStudent(Student student)
{
try
{
Connection con=DbConn.getConnection();

String sql="insert into student values(?,?,?,?,?,?)";

PreparedStatement stat=con.prepareStatement(sql);


stat.setInt(1, student.getStudentId());
stat.setInt(2, student.getCollegeId());
stat.setString(3, student.getStudentName());
stat.setString(4, student.getGender());
stat.setInt(5, student.getSem());
stat.setInt(6, student.getMarks());


int res= stat.executeUpdate();
if(res>0)
return "student saved";


}
catch (Exception e) {
e.printStackTrace();
}

return "Cannot save Student";

}


public ArrayList<Student> getAllStudents()
{
ArrayList<Student> studList=new ArrayList<Student>();
try
{
Connection con= DbConn.getConnection();

String sql="select * from student";
PreparedStatement stat=con.prepareStatement(sql);

ResultSet rs=stat.executeQuery();

if(rs.next())
{
do{
Student student=new Student();
student.setStudentId(rs.getInt(1));
student.setCollegeId(rs.getInt(2));
student.setStudentName(rs.getString(3));
student.setGender(rs.getString(4));
student.setSem(rs.getInt(5));
student.setMarks(rs.getInt(6));

studList.add(student);

}
while(rs.next());

}
else
{
return studList;
}


}
catch (Exception e) {
e.printStackTrace();
return null;

}

return studList;
}


public Student getStudentsById(int studentId)
{
try
{
Connection con= DbConn.getConnection();

String sql="select * from student where studid=?";
PreparedStatement stat=con.prepareStatement(sql);

stat.setInt(1, studentId);
ResultSet rs=stat.executeQuery();

if(rs.next())
{
Student student=new Student();
student.setStudentId(rs.getInt(1));
student.setCollegeId(rs.getInt(2));
student.setStudentName(rs.getString(3));
student.setGender(rs.getString(4));
student.setSem(rs.getInt(5));
student.setMarks(rs.getInt(6));

return student;
}
else
{
return null;
}


}
catch (Exception e) {
e.printStackTrace();
return null;

}

}


public String updateStudent(int studentId,Student student)
{

try
{
Student studentOld=getStudentsById(studentId);

if(student.getCollegeId()!=0)
{
studentOld.setCollegeId(student.getCollegeId());
}
if(student.getStudentName()!=null)
{
studentOld.setStudentName(student.getStudentName());
}
if(student.getGender()!=null)
{
studentOld.setGender(student.getGender());
}
if(student.getSem()!=0)
{
studentOld.setSem(student.getSem());
}
if(student.getMarks()!=0)
{
studentOld.setMarks(student.getMarks());
}



Connection con=DbConn.getConnection();
String sql="update student set clgid=?,sname=?,gender=?,sem=?,marks=? where studid=?";

PreparedStatement stat=con.prepareStatement(sql);

stat.setInt(1, studentOld.getCollegeId());
stat.setString(2, studentOld.getStudentName());
stat.setString(3, studentOld.getGender());
stat.setInt(4, studentOld.getSem());
stat.setInt(5, studentOld.getMarks());
stat.setInt(6, studentOld.getStudentId());
 
 int res=stat.executeUpdate();

 if(res>0)
return "yes";

}
catch (Exception e) {
e.printStackTrace();
}


  return "no";
}




}

