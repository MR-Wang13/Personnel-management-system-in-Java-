import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DeleteDemo {
 @SuppressWarnings("null")
public void Deletesql(String id){
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
		sql="delete from PERSON where PID="+id+";";
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
