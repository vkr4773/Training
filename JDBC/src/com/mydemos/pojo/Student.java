package com.mydemos.pojo;

public class Student {

public int getStudentId() {
return studentId;
}
public void setStudentId(int studentId) {
this.studentId = studentId;
}
public int getCollegeId() {
return collegeId;
}
public void setCollegeId(int collegeId) {
this.collegeId = collegeId;
}
public String getStudentName() {
return studentName;
}
public void setStudentName(String studentName) {
this.studentName = studentName;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public int getSem() {
return sem;
}
public void setSem(int sem) {
this.sem = sem;
}
public int getMarks() {
return marks;
}
public void setMarks(int marks) {
this.marks = marks;
}
int studentId;
int collegeId;
String studentName;
String gender;
int sem;
int marks;


@Override
public String toString() {

return getStudentId()+" "+getCollegeId()+" "+getStudentName()+" "+getGender()+" "+getSem()+" "+getMarks();

}


}