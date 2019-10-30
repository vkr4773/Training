package com.myhib.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_info")
@Entity
public class User {


@Id
@Column(name="user_id")
int uid;
String userName;
@Column(name="date_info")
Date date;


@Embedded
Address address;

@Embedded
@AttributeOverrides( {
    @AttributeOverride(name="city", column = @Column(name="Home_City") ),
    @AttributeOverride(name="pinCode", column = @Column(name="home_PinCode") ),
    @AttributeOverride(name="Street", column = @Column(name="home_Street") )
} )
Address homeaddress;

public Address getHomeaddress() {
	return homeaddress;
}
public void setHomeaddress(Address homeaddress) {
	this.homeaddress = homeaddress;
}
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}

public Date getDate() {
return date;
}
public void setDate(Date date) {
this.date = date;
}
public int getUid() {
return uid;
}
public void setUid(int uid) {
this.uid = uid;
}

public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}


}
