package newonnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("orale.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		Statement st = con.createStatement();
		String sql = "selet * from firsttablemine";
		ResultSet  rs  = st.executeQuery(sql);
		while(rs.next())
			System.out.println(rs.getInt(1)+"   "+rs.getString(2));
		con.close();
		}
		
catch (Exception e)
		{
	System.out.println(e);
		}
	}

}
