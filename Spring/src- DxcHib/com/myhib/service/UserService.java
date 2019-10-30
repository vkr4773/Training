package com.myhib.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.myhib.dao.UserDao;
import com.myhib.model.Address;
import com.myhib.model.User;

public class UserService {

	public static void main(String[] args) throws Exception {

		Address address = new Address();
		address.setCity("Bang");
		address.setStreet("M.G Road");
		address.setPinCode(526488);
		
		Address homeaddress = new Address();
		homeaddress.setCity("Del");
		homeaddress.setStreet("G.B .Road");
		homeaddress.setPinCode(100100);

		
		  User user=new User();
		  
		  user.setUid(1);
		  user.setUserName("Vkr001");
		  user.setAddress(address);
		  user.setHomeaddress(homeaddress);
		  String dob="10-13-1996"; SimpleDateFormat sd=new
		  SimpleDateFormat("MM-dd-yyyy"); Date dobCon=sd.parse(dob);
		  
		  user.setDate(dobCon);
		  
		  UserDao dao=new UserDao();
		  
		  dao.saveUser(user);
		 

		/*
		 * ArrayList<User> userList= dao.getUsers();
		 * 
		 * for(User user1:userList) { System.out.println(user1.getUserName());
		 * 
		 * }
		 */
		System.out.println("done");
	}

}
