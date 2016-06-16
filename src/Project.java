import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
 

public class Project
{
	
public static void main(String[] args)
{
	new Login();
	
//	String sql;
//	Connection conn=null;
//	Statement stmt=null;
//	ResultSet rs = null;
//	String s=null;
//	try
//	{
//	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//	String url="jdbc:odbc:java_sql";
//	String user="sa";
//	String password="12345";
//	conn= DriverManager.getConnection(url,user,password);
//	stmt=conn.createStatement();
//	sql="select * from PERSON where PID ="+2+";";
//	rs=stmt.executeQuery(sql);
//	
//	int i;
//	while(rs.next()){
//		s=rs.getString("PASSWD");
//		
//	}
//	
//	System.out.println(s);
//	rs.close();
//	stmt.close();
//	conn.close();
//	}
//	catch(Exception e1)
//	{
//	e1.printStackTrace();
//	}
}
}
