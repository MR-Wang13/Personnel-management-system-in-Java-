import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Passwd extends JFrame{
	String s1=null;
	private JTextField textField_2;
	private JTextField textField_3;
	Passwd(String s1) throws SQLException{
		this.s1=s1;
		initGUI();
		
	}
	private void initGUI() throws SQLException {
		// TODO Auto-generated method stub
		  final JFrame mf=new JFrame("ÃÜÂëÐÞ¸Ä");
		  mf.setLocation(660,340);
		  mf.setBackground(Color.BLUE);
		JPanel jp=new JPanel();
		jp.setBackground(Color.GRAY);
		jp.setLayout(null);
		mf.getContentPane().add(jp);
		JButton btnNewButton = new JButton("\u4FEE\u6539\u5BC6\u7801");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(271, 250, 94, 30);
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
				sql="update PERSON set PASSWD='"+textField_3.getText()+"' where PID="+s1+";";
				stmt.execute(sql);
				
			
				rs.close();
				stmt.close();
				conn.close();
				}
				catch(Exception e1)
				{
				e1.printStackTrace();
				}			
				new Myframe(s1);
			}
			
		});
		jp.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("\u65B0\u5BC6\u7801");
		textField_2.setBounds(108, 207, 46, 21);
		jp.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(185, 207, 105, 21);
		jp.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.setForeground(Color.RED);
		button.setBounds(96, 254, 93, 26);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.setVisible(false);
				new Myframe(s1);
			}
			
		});
		jp.add(button);
		
		
		mf.setVisible(true);
		mf.setSize(500, 500);
		
		
	}
	}
	
	
