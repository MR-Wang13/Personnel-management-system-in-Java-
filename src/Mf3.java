import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.ScrollPaneConstants;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Mf3 extends JFrame{
	Mf3(){
		initGUI();
	}
	
	private JScrollPane scpDemo;
	private	 JTableHeader jth;
	private	 JTable tabDemo;
	private JButton button;
	private void initGUI() {
		// TODO Auto-generated method stub
		  final JFrame mf3=new JFrame("人事变动");
		
		scpDemo = new JScrollPane();
		scpDemo.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scpDemo.setBounds(0, 0, 792, 409);
		
		
		mf3.setVisible(true);
		mf3.setSize(800,800);
		
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
			sql="select * from PERSONNEL";
			rs=stmt.executeQuery(sql);
			int count = 0;
			
			while(rs.next()){
			
			count++;
			}
			
			rs=stmt.executeQuery(sql);
			
			final Object[][] info1 = new Object[count][15];
			count = 0;
		
		while(rs.next()){
			info1[count][0] = rs.getString("ID");
			info1[count][1] = rs.getString("PERSON");
			info1[count][2] = rs.getString("CHANGE");
			info1[count][3] = rs.getString("DESCRIPTION");
			
		count++;
		}
		final String tableRows[]={"记录编号","员工号","变更代码","详细记录"};

		tabDemo= new JTable(info1,tableRows);
		jth = ((JTable) this.tabDemo).getTableHeader();
		mf3.getContentPane().setLayout(null);
		scpDemo.setViewportView( tabDemo);
		mf3.getContentPane().add(scpDemo);
		
		button = new JButton("\u8FD4\u56DE");
		button.setBounds(36, 694, 93, 23);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf3.setVisible(false);
				new Myframe();
			}
			
		});
		mf3.getContentPane().add(button);

		rs.close();
		conn.close();
		stmt.close();
		}
		catch(Exception e1)
		{
		e1.printStackTrace();
		}
		
	}
	
}
	
	
