package com.myhib.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

String city;
int pinCode;
String Street;
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public int getPinCode() {
return pinCode;
}
public void setPinCode(int pinCode) {
this.pinCode = pinCode;
}
public String getStreet() {
return Street;
}
public void setStreet(String street) {
Street = street;
}


}