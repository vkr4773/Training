package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveData {


void getData()
{

try
{

Class.forName("oracle.jdbc.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dxc","pass");

String sql="select * from jdbc";
PreparedStatement stat=con.prepareStatement(sql);

ResultSet rs= stat.executeQuery();
if(rs.next())
{
do
{
System.out.print(reverse(rs.getString(1))+",");

}
while(rs.next());
}
else
{
System.out.println("DATA NOT FOUND");
}


}
catch (Exception e) {
e.printStackTrace();
}
}

static String  reverse(String str){
	String s = "";
	for(int i = str.length()-1; i>=0;i--) {
		s+=str.charAt(i);
	}
	return s;
}


public static void main(String[] args) {

new RetrieveData().getData();

}
}
