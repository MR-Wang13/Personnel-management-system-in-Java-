import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Mf4 extends JFrame{
	String s1=null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	Mf4(String s1){
		this.s1=s1;
		initGUI();
		
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		  final JFrame mf=new JFrame("人员信息");
		  mf.setLocation(660,340);
		  mf.setBackground(Color.BLUE);
		JPanel jp=new JPanel();
		jp.setBackground(Color.GRAY);
		jp.setLayout(null);
		mf.getContentPane().add(jp);
		List<JTextField> list = new ArrayList<JTextField>();
		textField = new JTextField();
		textField.setBounds(76, 65, 88, 21);
		list.add(textField);
		jp.add(textField);
		textField.setColumns(10);
		textField_1 = new JTextField();
		textField_1.setBounds(76, 107, 88, 21);
		list.add(textField_1);
		jp.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 148, 88, 21);
		list.add(textField_2);
		jp.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 191, 88, 21);
		list.add(textField_3);
		jp.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(76, 274, 88, 21);
		list.add(textField_4);
		jp.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(76, 315, 88, 21);
		list.add(textField_5);
		jp.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(76, 356, 88, 21);
		list.add(textField_6);
		jp.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(250, 65, 88, 21);
		list.add(textField_7);
		jp.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(250, 107, 88, 21);
		list.add(textField_8);
		jp.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(250, 148, 88, 21);
		list.add(textField_9);
		jp.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(250, 191, 88, 21);
		list.add(textField_10);
		jp.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(250, 232, 88, 21);
		list.add(textField_11);
		jp.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(250, 274, 88, 21);
		list.add(textField_12);
		jp.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(250, 315, 88, 21);
		list.add(textField_13);
		jp.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(76, 232, 88, 21);
		list.add(textField_14);
		jp.add(textField_14);
		textField_14.setColumns(10);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.setBounds(302, 355, 93, 23);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.setVisible(false);
				new Myframe(s1);
			}
			
		});
		jp.add(button);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setText("\u5458\u5DE5\u53F7");
		textField_15.setBounds(0, 65, 66, 21);
		jp.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setText("\u5BC6\u7801");
		textField_16.setBounds(0, 107, 66, 21);
		jp.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setText("\u7528\u6237\u6743\u9650");
		textField_17.setBounds(0, 148, 66, 21);
		jp.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setText("\u59D3\u540D");
		textField_18.setBounds(0, 191, 66, 21);
		jp.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setText("\u751F\u65E5");
		textField_19.setBounds(0, 274, 66, 21);
		jp.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setText("\u6240\u5728\u90E8\u95E8");
		textField_20.setBounds(0, 315, 66, 21);
		jp.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setText("\u804C\u52A1");
		textField_21.setBounds(0, 356, 66, 21);
		jp.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setText("\u53D7\u6559\u80B2\u7A0B\u5EA6");
		textField_22.setBounds(174, 65, 66, 21);
		jp.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setText("\u4E13\u4E1A\u6280\u80FD");
		textField_23.setBounds(174, 107, 66, 21);
		jp.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setText("\u5BB6\u5EAD\u4F4F\u5740");
		textField_24.setBounds(174, 148, 66, 21);
		jp.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setText("\u8054\u7CFB\u7535\u8BDD");
		textField_25.setBounds(174, 191, 66, 21);
		jp.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setText("\u7535\u5B50\u90AE\u7BB1");
		textField_26.setBounds(174, 232, 66, 21);
		jp.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setText("\u5F53\u524D\u72B6\u6001");
		textField_27.setBounds(174, 274, 66, 21);
		jp.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setText("\u5907\u6CE8");
		textField_28.setBounds(174, 315, 66, 21);
		jp.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setText("\u6027\u522B");
		textField_29.setBounds(0, 232, 66, 21);
		jp.add(textField_29);
		textField_29.setColumns(10);
		String sql;
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs = null;
		String s=null;
		
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String url="jdbc:odbc:java_sql";
		String user="sa";
		String password="12345";
		conn= DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		sql="select * from PERSON where PID ="+s1+";";
		rs=stmt.executeQuery(sql);
		String[] st={"PID","PASSWD","AUTHORITY","NAME","SEX","BIRTHDAY","DEPARTMENT","POSITION","EDU_LEVEL","SPCIALTY","ADDRESS","TEL","EMAIL","STATE","REMARK"};
		
		while(rs.next()){
			for(int n=0;n<=14;n++){
			s=rs.getString(st[n]);
			list.get(n).setText(s);
			
			}
			
		}
		
		
//		textField.setText(s);
		
		
		
		rs.close();
		stmt.close();
		conn.close();
		}
		catch(Exception e1)
		{
		e1.printStackTrace();
		}
		
		mf.setVisible(true);
		mf.setSize(500, 500);
		
		
	}
	}
	
	
