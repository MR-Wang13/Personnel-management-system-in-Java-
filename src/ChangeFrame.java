import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ChangeFrame extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	ChangeFrame(){
		initGUI();
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		  final JFrame mf=new JFrame("添加人事变动");
		  mf.setLocation(660,340);
		JPanel jp=new JPanel();
		jp.setLayout(null);
		
		mf.getContentPane().add(jp);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("\u8BB0\u5F55\u7F16\u53F7");
		textField_1.setBounds(20, 105, 66, 21);
		jp.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 105, 164, 21);
		GetId c=new GetId("PERSONNEL");
				int i=c.getId()+1;
				textField_2.setText(Integer.toString(i));
		jp.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("\u5458\u5DE5\u53F7");
		textField_3.setBounds(20, 153, 66, 21);
		jp.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 153, 164, 21);
		jp.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setText("\u53D8\u66F4\u4EE3\u7801");
		textField_5.setBounds(20, 195, 66, 21);
		jp.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(101, 195, 164, 21);
		jp.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setText("\u8BE6\u7EC6\u8BB0\u5F55");
		textField_7.setBounds(20, 232, 66, 21);
		jp.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(101, 232, 164, 21);
		jp.add(textField_8);
		textField_8.setColumns(10);
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.setBounds(314, 168, 93, 23);
		jp.add(button);
		
		button.addActionListener(new ActionListener(){

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
				stmt=(Statement) conn.createStatement();
				
				sql="insert into PERSONNEL(ID,PERSON,CHANGE,DESCRIPTION)values('"+textField_2.getText()+"','"+textField_4.getText()+"','"+textField_6.getText()+"','"
				+textField_8.getText()+"')";
				
				@SuppressWarnings("unused")
				int num= ((java.sql.Statement) stmt).executeUpdate(sql);
				
				
				
				 stmt.close();
				 rs.close();
				conn.close();
				}
				catch(Exception e1)
				{
				e1.printStackTrace();
				}
				mf.setVisible(false);
				
			}
			
		});
		
		mf.setVisible(true);
		mf.setSize(500, 500);
		
		
		
	}
	}
	
	
