package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// load driver
// connect to db
// create n exe sql statements
// sqlExceptions


public class Jdbc_Main {


void insertEmp(int id,String name)
{
try
{
Class.forName("oracle.jdbc.OracleDriver");
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","dxc","pass");
System.out.println("connected");

//con.setAutoCommit(false);

String sql="insert into students values(?,?)";
PreparedStatement stat=con.prepareStatement(sql);


stat.setInt(1, id);
stat.setString(2, name);

stat.executeUpdate();
System.out.println("inserted");
}
catch (Exception e) {

e.printStackTrace();
}


}


public static void main(String[] args) {

Jdbc_Main jdbcMain=new Jdbc_Main();

//jdbcMain.insertEmp(args[0], Integer.parseInt(args[1]), args[2]);

Scanner scan=new Scanner(System.in);

System.out.println("plz enter Id and Name");
int id=Integer.parseInt(scan.nextLine());
String name=scan.nextLine();

jdbcMain.insertEmp( id, name);


}

}


