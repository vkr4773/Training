package com.myhib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {


String day;   

@Column(name="sess")
int session; 

@Id
@Column(name="fac")
String faculty; 

int room;         
int sem ;  
@Column(name="sub")
String subject;

public String getDay() {
	return day;
}

public void setDay(String day) {
	this.day = day;
}

public int getSession() {
	return session;
}


public void setSession(int session) {
	this.session = session;
}

public String getFaculty() {
	return faculty;
}

public void setFaculty(String faculty) {
	this.faculty = faculty;
}

public int getRoom() {
	return room;
}

public void setRoom(int room) {
	this.room = room;
}

public int getSem() {
	return sem;
}

public void setSem(int sem) {
	this.sem = sem;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

@Override
public String toString() {

return getDay()+" "+getSession()+" "+getFaculty()+" "+getRoom()+" "+getSem()+" "+getSubject();

}


}
