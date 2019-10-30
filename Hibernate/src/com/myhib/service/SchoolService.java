package com.myhib.service;

import java.util.ArrayList;

import com.myhib.dao.SchoolDao;
import com.myhib.model.School;

public class SchoolService {

public static void main(String[] args) {

SchoolDao dao=new SchoolDao();
ArrayList<School> studs= dao.getSchoolsBySession(2,8);


for(School fac:studs)
{
System.out.println(fac);
	
}


}

}