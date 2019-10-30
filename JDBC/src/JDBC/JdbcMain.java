package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//load driver
//Connect to DB
//create and execute SQL 
//handleException
public class JdbcMain {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dxc","pass");
			
			
			String sql = "insert into emp values(6,'vkr' ,27 , 2 ,date '96-01-01' )";
			PreparedStatement stat = con.prepareStatement(sql);
			stat.executeUpdate();
			System.out.println("Inserted");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
