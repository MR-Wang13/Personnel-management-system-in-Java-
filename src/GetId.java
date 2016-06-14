import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class GetId {
	String s=null;
 GetId(String s){
	 this.s=s;
	 
 }
	public int getId(){
		String sql;
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs = null;
		int i = 0;
		
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String url="jdbc:odbc:java_sql";
		String user="sa";
		String password="12345";
		conn= DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		sql="select * from "+s;
		rs=stmt.executeQuery(sql);
		
		while(rs.next()){
			i=rs.getInt(1);
			
		}
		
		
		rs.close();
		stmt.close();
		conn.close();
		}
		catch(Exception e1)
		{
		e1.printStackTrace();
		}
		return i;
		
	}
}
