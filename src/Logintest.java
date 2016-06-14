import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Logintest {
	private String l1=null;
	private String l2=null;
	public int find(String s1, String s2) {
		
		String sql;
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs = null;
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String url="jdbc:odbc:java_sql";
		String user="sa";
		String password="12345";
		conn= DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		sql="select * from PERSON";
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			l1=rs.getString(1);
			l2=rs.getString(2);
			if(l1.equals(s1)&& l2.equals(s2)){
				rs.close();
				stmt.close();
				conn.close();
				return 1;
			}
		}
		
			
		rs.close();
		stmt.close();
		conn.close();
		}
		catch(Exception e1)
		{
		e1.printStackTrace();
		}
		return 0;
		
	}
	}
	
	
	

