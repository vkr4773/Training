package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcReverse {
	static void insertRev(String s , Connection con) {
		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","dxc","pass");
//			System.out.println("Connected");
			
			String sql = "insert into jdbc values(?)";
			PreparedStatement stat =  con.prepareStatement(sql);
			System.out.println(reverse(s));
			
			stat.setString(1, reverse(s));
			stat.executeUpdate();
			System.out.println("Inserted");
		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
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
		//JdbcReverse jdbcreverse = new JdbcReverse();
		Connection con =null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","dxc","pass");
			System.out.println("Connected");
		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}
		String name = "ij idom , ij hahs, uppap , lawirjek";
		String[] namearr  = name.split(",");
		for(String str: namearr) {
			insertRev(str , con);
		}
		// TODO Auto-generated method stub

	}

}
