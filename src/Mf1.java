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
import javax.swing.JTextField;

public class Mf1 extends JFrame {
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
	private JButton button;

	Mf1(){
		initGUI();
	}

	private void initGUI() {
		// TODO Auto-generated method stub
		final JFrame mf1=new JFrame("添加员工");
				mf1.setSize(500, 575);
				mf1.setVisible(true);
				JPanel jp=new JPanel();
				JButton yes=new JButton("确定");
				yes.setBounds(387, 474, 57, 23);
				JTextArea pid =new  JTextArea("员工号");
				pid.setEditable(false);
				pid.setBounds(138, 5, 66, 24);
				final JTextArea pid1 =new  JTextArea(1,8);
				pid1.setBounds(209, 5, 169, 24);
				jp.setLayout(null);
				GetId g=new GetId("PERSON");
				int i=0;
				i=g.getId()+1;
				pid1.setText(Integer.toString(i));
				jp.add(pid);
				jp.add(pid1);
				jp.add(yes);
				mf1.getContentPane().add(jp);
				
				textField = new JTextField();
				textField.setEditable(false);
				textField.setText("\u5BC6\u7801");
				textField.setBounds(138, 39, 66, 21);
				jp.add(textField);
				textField.setColumns(10);
				
				textField_1 = new JTextField();
				textField_1.setBounds(209, 39, 169, 21);
				jp.add(textField_1);
				textField_1.setColumns(10);
				
				textField_2 = new JTextField();
				textField_2.setEditable(false);
				textField_2.setText("\u7528\u6237\u6743\u9650");
				textField_2.setBounds(138, 70, 66, 21);
				jp.add(textField_2);
				textField_2.setColumns(10);
				
				textField_3 = new JTextField();
				textField_3.setBounds(209, 70, 169, 21);
				jp.add(textField_3);
				textField_3.setColumns(10);
				
				textField_4 = new JTextField();
				textField_4.setEditable(false);
				textField_4.setText("\u59D3\u540D");
				textField_4.setBounds(138, 101, 66, 21);
				jp.add(textField_4);
				textField_4.setColumns(10);
				
				textField_5 = new JTextField();
				textField_5.setBounds(209, 101, 169, 21);
				jp.add(textField_5);
				textField_5.setColumns(10);
				
				textField_6 = new JTextField();
				textField_6.setEditable(false);
				textField_6.setText("\u751F\u65E5");
				textField_6.setBounds(138, 163, 66, 21);
				jp.add(textField_6);
				textField_6.setColumns(10);
				
				textField_7 = new JTextField();
				textField_7.setBounds(209, 163, 169, 21);
				jp.add(textField_7);
				textField_7.setColumns(10);
				
				textField_8 = new JTextField();
				textField_8.setEditable(false);
				textField_8.setText("\u6240\u5728\u90E8\u95E8");
				textField_8.setBounds(138, 194, 66, 21);
				jp.add(textField_8);
				textField_8.setColumns(10);
				
				textField_9 = new JTextField();
				textField_9.setBounds(209, 194, 169, 21);
				jp.add(textField_9);
				textField_9.setColumns(10);
				
				textField_10 = new JTextField();
				textField_10.setEditable(false);
				textField_10.setText("\u804C\u52A1");
				textField_10.setBounds(138, 225, 66, 21);
				jp.add(textField_10);
				textField_10.setColumns(10);
				
				textField_11 = new JTextField();
				textField_11.setBounds(209, 225, 169, 21);
				jp.add(textField_11);
				textField_11.setColumns(10);
				
				textField_12 = new JTextField();
				textField_12.setEditable(false);
				textField_12.setText("\u53D7\u6559\u80B2\u7A0B\u5EA6");
				textField_12.setBounds(138, 256, 66, 21);
				jp.add(textField_12);
				textField_12.setColumns(10);
				
				textField_13 = new JTextField();
				textField_13.setBounds(209, 256, 169, 21);
				jp.add(textField_13);
				textField_13.setColumns(10);
				
				textField_14 = new JTextField();
				textField_14.setEditable(false);
				textField_14.setText("\u4E13\u4E1A\u6280\u80FD");
				textField_14.setBounds(138, 287, 66, 21);
				jp.add(textField_14);
				textField_14.setColumns(10);
				
				textField_15 = new JTextField();
				textField_15.setBounds(208, 287, 170, 21);
				jp.add(textField_15);
				textField_15.setColumns(10);
				
				textField_16 = new JTextField();
				textField_16.setEditable(false);
				textField_16.setText("\u5BB6\u5EAD\u4F4F\u5740");
				textField_16.setBounds(138, 318, 66, 21);
				jp.add(textField_16);
				textField_16.setColumns(10);
				
				textField_17 = new JTextField();
				textField_17.setBounds(209, 318, 169, 21);
				jp.add(textField_17);
				textField_17.setColumns(10);
				
				textField_18 = new JTextField();
				textField_18.setEditable(false);
				textField_18.setText("\u8054\u7CFB\u7535\u8BDD");
				textField_18.setBounds(138, 349, 66, 21);
				jp.add(textField_18);
				textField_18.setColumns(10);
				
				textField_19 = new JTextField();
				textField_19.setBounds(209, 349, 169, 21);
				jp.add(textField_19);
				textField_19.setColumns(10);
				
				textField_20 = new JTextField();
				textField_20.setEditable(false);
				textField_20.setText("\u7535\u5B50\u90AE\u7BB1");
				textField_20.setBounds(138, 380, 66, 21);
				jp.add(textField_20);
				textField_20.setColumns(10);
				
				textField_21 = new JTextField();
				textField_21.setBounds(209, 380, 169, 21);
				jp.add(textField_21);
				textField_21.setColumns(10);
				
				textField_22 = new JTextField();
				textField_22.setEditable(false);
				textField_22.setText("\u5F53\u524D\u72B6\u6001");
				textField_22.setBounds(138, 411, 66, 21);
				jp.add(textField_22);
				textField_22.setColumns(10);
				
				textField_23 = new JTextField();
				textField_23.setBounds(209, 411, 169, 21);
				jp.add(textField_23);
				textField_23.setColumns(10);
				
				textField_24 = new JTextField();
				textField_24.setEditable(false);
				textField_24.setText("\u5907\u6CE8");
				textField_24.setBounds(138, 442, 66, 21);
				jp.add(textField_24);
				textField_24.setColumns(10);
				
				textField_25 = new JTextField();
				textField_25.setBounds(209, 442, 169, 21);
				jp.add(textField_25);
				textField_25.setColumns(10);
				
				textField_26 = new JTextField();
				textField_26.setEditable(false);
				textField_26.setText("\u6027\u522B");
				textField_26.setBounds(138, 132, 66, 21);
				jp.add(textField_26);
				textField_26.setColumns(10);
				
				textField_27 = new JTextField();
				textField_27.setBounds(209, 132, 169, 21);
				jp.add(textField_27);
				textField_27.setColumns(10);
				
				button = new JButton("\u8FD4\u56DE");
				button.setBounds(79, 474, 66, 23);
				jp.add(button);
				button.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						new Myframe();
						mf1.setVisible(false);
						
					}
					
				});
				yes.addActionListener(new ActionListener(){

					@SuppressWarnings("null")
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
						sql="insert into PERSON(PID,PASSWD,AUTHORITY,NAME,SEX,BIRTHDAY,DEPARTMENT,[POSITION],EDU_LEVEL,SPCIALTY,ADDRESS,TEL,EMAIL,STATE,REMARK)values('"
						+pid1.getText()+"','"+textField_1.getText()+"','"+textField_3.getText()+"','"+textField_5.getText()+"','"+textField_27.getText()+"','"+textField_7.getText()+"','"+textField_9.getText()+"','"+textField_11.getText()+"','"+
						textField_13.getText()+"','"+textField_15.getText()+"','"+textField_17.getText()+"','"+textField_19.getText()+"','"+textField_21.getText()+"','"+textField_23.getText()+"','"+textField_25.getText()+"')";
						
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
					}
					
				});
	}


}
