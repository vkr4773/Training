package com.myhib.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customers {

@Id
int custId;
String custName;

public int getCustId() {
return custId;
}
public void setCustId(int custId) {
this.custId = custId;
}
public String getCustName() {
return custName;
}
public void setCustName(String custName) {
this.custName = custName;
}

}

