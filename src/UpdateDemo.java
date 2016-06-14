import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class UpdateDemo {
	
	@SuppressWarnings("null")
	public void update(String id,String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String d,String d1,String d2,String d3){
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
		sql="update PERSON set PASSWD='"+s+"',AUTHORITY='"+s1+"',NAME='"+s2+"',SEX='"+s3+"',BIRTHDAY='"+s4+"',DEPARTMENT='"+s5+"',POSITION='"+s6+"',EDU_LEVEL='"+s7+"',SPCIALTY='"+s8
				+"',ADDRESS='"+s9+"',TEL='"+d+"',EMAIL='"+d1+"',STATE='"+d2+"',REMARK ='"+d3+"' where PID="+id+";";
		stmt.execute(sql);
		
	
		rs.close();
		stmt.close();
		conn.close();
		}
		catch(Exception e1)
		{
		e1.printStackTrace();
		}
	}
}
