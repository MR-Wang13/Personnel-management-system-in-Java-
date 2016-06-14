import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.JTableHeader;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class Mf2 {

private JScrollPane scpDemo;
private	 JTableHeader jth;
private	 JTable tabDemo;
private JScrollPane scpDemo1;
private	 JTableHeader jth1;
private	 JTable tabDemo1;
private JButton btnNewButton;
private JTextField textField;
private JTextField textField_1;
private JButton button;
private JTextField textField_2;
private JTextField textField_3;
private JButton button_1;
private JTextField textField_4;
private JTextField textField_5;
private JButton btnNewButton_1;
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
private JTextField textField_30;
private JTextField textField_31;
private JTextField textField_32;
private JTextField textField_33;
private JTextField textField_34;
private JTextField textField_35;
private JButton button_2;

Mf2(){
	initGUI();
}

private void initGUI() {
	// TODO Auto-generated method stub
	 
	final JFrame mf2=new JFrame("人员信息");
	
	mf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	scpDemo = new JScrollPane();
	scpDemo.setBounds(0, 0, 800, 356);
	scpDemo1 = new JScrollPane();
	scpDemo1.setBounds(0, 355, 800, 130);
	mf2.setVisible(true);
	mf2.setSize(800, 800);
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
	int count = 0;
	while(rs.next()){
	count++;
	}
	rs=stmt.executeQuery(sql);
	Object[][] info = new Object[count][15];
	final Object[][] info1 = new Object[count][15];
	count = 0;
	while(rs.next()){
	info[count][0] = rs.getString("PID");
	info[count][1] = rs.getString("PASSWD");
	info[count][2] = rs.getString("AUTHORITY");
	info[count][3] = rs.getString("NAME");
	info[count][4] = rs.getString("SEX");
	info[count][5] = rs.getString("BIRTHDAY");
	info[count][6] = rs.getString("DEPARTMENT");
	info[count][7] = rs.getString("POSITION");
	info[count][8] = rs.getString("EDU_LEVEL");
	info[count][9] = rs.getString("SPCIALTY");
	info[count][10] = rs.getString("ADDRESS");
	info[count][11] = rs.getString("TEL");
	info[count][12] = rs.getString("EMAIL");
	info[count][13] = rs.getString("STATE");
	info[count][14] = rs.getString("REMARK");
	count++;
	}
	final String tableRows[]={"员工号","密码","用户权限","姓名","性别","生日","所在部门","职务","受教育程度","专业技能","家庭住址","联系电话","电子邮箱","当前状态","备注"};
tabDemo= new JTable(info,tableRows);
tabDemo1= new JTable(info1,tableRows);jth1 = this.tabDemo1.getTableHeader();scpDemo1.setViewportView(tabDemo1);mf2.getContentPane().add(scpDemo1);


jth = this.tabDemo.getTableHeader();
mf2.getContentPane().setLayout(null);
scpDemo.setViewportView(tabDemo);
mf2.getContentPane().add(scpDemo);

btnNewButton = new JButton("\u8FD4\u56DE");
btnNewButton.setBounds(10, 733, 93, 23);
mf2.getContentPane().add(btnNewButton);
textField = new JTextField();
textField.setEditable(false);
textField.setText("\u8F93\u5165\u8981\u5220\u9664\u7684\u5458\u5DE5\u53F7");
textField.setBounds(510, 600, 120, 21);
mf2.getContentPane().add(textField);
textField.setColumns(10);
textField_1 = new JTextField();
textField_1.setBounds(640, 600, 66, 21);
mf2.getContentPane().add(textField_1);
textField_1.setColumns(10);
button = new JButton("\u786E\u5B9A");
button.setBounds(716, 599, 66, 23);
mf2.getContentPane().add(button);
textField_2 = new JTextField();
textField_2.setEditable(false);
textField_2.setText("\u8F93\u51FA\u8981\u67E5\u8BE2\u7684\u5458\u5DE5\u53F7");
textField_2.setBounds(508, 552, 122, 21);
mf2.getContentPane().add(textField_2);
textField_2.setColumns(10);
textField_3 = new JTextField();
textField_3.setBounds(640, 552, 66, 21);
mf2.getContentPane().add(textField_3);
textField_3.setColumns(10);
button_1 = new JButton("\u67E5\u8BE2");
button_1.setBounds(716, 551, 66, 23);
mf2.getContentPane().add(button_1);
textField_4 = new JTextField();
textField_4.setEditable(false);
textField_4.setText("\u8F93\u5165\u8981\u4FEE\u6539\u7684\u5458\u5DE5\u53F7");
textField_4.setBounds(510, 510, 120, 21);
mf2.getContentPane().add(textField_4);
textField_4.setColumns(10);
textField_5 = new JTextField();
textField_5.setBounds(640, 510, 66, 21);
mf2.getContentPane().add(textField_5);
textField_5.setColumns(10);
btnNewButton_1 = new JButton("\u786E\u5B9A");
btnNewButton_1.setBounds(716, 509, 66, 23);
mf2.getContentPane().add(btnNewButton_1);
textField_6 = new JTextField();
textField_6.setEditable(false);
textField_6.setText("\u5458\u5DE5\u53F7");
textField_6.setBounds(10, 495, 44, 21);
mf2.getContentPane().add(textField_6);
textField_6.setColumns(10);
textField_7 = new JTextField();
textField_7.setBounds(61, 495, 66, 21);
mf2.getContentPane().add(textField_7);
textField_7.setColumns(10);
textField_8 = new JTextField();
textField_8.setEditable(false);
textField_8.setText("\u5BC6\u7801");
textField_8.setBounds(10, 523, 37, 21);
mf2.getContentPane().add(textField_8);
textField_8.setColumns(10);
textField_9 = new JTextField();
textField_9.setEditable(false);
textField_9.setText("\u7528\u6237\u6743\u9650");
textField_9.setBounds(10, 552, 56, 21);
mf2.getContentPane().add(textField_9);
textField_9.setColumns(10);
textField_10 = new JTextField();
textField_10.setEditable(false);
textField_10.setText("\u59D3\u540D");
textField_10.setBounds(10, 583, 37, 21);
mf2.getContentPane().add(textField_10);
textField_10.setColumns(10);
textField_11 = new JTextField();
textField_11.setEditable(false);
textField_11.setText("\u6027\u522B");
textField_11.setBounds(10, 614, 37, 21);
mf2.getContentPane().add(textField_11);
textField_11.setColumns(10);
textField_12 = new JTextField();
textField_12.setEditable(false);
textField_12.setText("\u751F\u65E5");
textField_12.setBounds(10, 645, 37, 21);
mf2.getContentPane().add(textField_12);
textField_12.setColumns(10);
textField_13 = new JTextField();
textField_13.setEditable(false);
textField_13.setText("\u6240\u5728\u90E8\u95E8");
textField_13.setBounds(10, 676, 56, 21);
mf2.getContentPane().add(textField_13);
textField_13.setColumns(10);
textField_14 = new JTextField();
textField_14.setEditable(false);
textField_14.setText("\u804C\u52A1");
textField_14.setBounds(196, 495, 30, 21);
mf2.getContentPane().add(textField_14);
textField_14.setColumns(10);
textField_15 = new JTextField();
textField_15.setEditable(false);
textField_15.setText("\u53D7\u6559\u80B2\u7A0B\u5EA6");
textField_15.setBounds(196, 523, 66, 21);
mf2.getContentPane().add(textField_15);
textField_15.setColumns(10);
textField_16 = new JTextField();
textField_16.setEditable(false);
textField_16.setText("\u4E13\u4E1A\u6280\u80FD");
textField_16.setBounds(196, 552, 66, 21);
mf2.getContentPane().add(textField_16);
textField_16.setColumns(10);
textField_17 = new JTextField();
textField_17.setEditable(false);
textField_17.setText("\u5BB6\u5EAD\u4F4F\u5740");
textField_17.setBounds(196, 583, 66, 21);
mf2.getContentPane().add(textField_17);
textField_17.setColumns(10);
textField_18 = new JTextField();
textField_18.setEditable(false);
textField_18.setText("\u8054\u7CFB\u7535\u8BDD");
textField_18.setBounds(196, 614, 66, 21);
mf2.getContentPane().add(textField_18);
textField_18.setColumns(10);
textField_19 = new JTextField();
textField_19.setEditable(false);
textField_19.setText("\u7535\u5B50\u90AE\u7BB1");
textField_19.setBounds(196, 645, 66, 21);
mf2.getContentPane().add(textField_19);
textField_19.setColumns(10);
textField_20 = new JTextField();
textField_20.setEditable(false);
textField_20.setText("\u5F53\u524D\u72B6\u6001");
textField_20.setBounds(196, 676, 66, 21);
mf2.getContentPane().add(textField_20);
textField_20.setColumns(10);
textField_21 = new JTextField();
textField_21.setText("\u5907\u6CE8");
textField_21.setBounds(75, 707, 37, 21);
mf2.getContentPane().add(textField_21);
textField_21.setColumns(10);
textField_22 = new JTextField();
textField_22.setBounds(61, 523, 66, 21);
mf2.getContentPane().add(textField_22);
textField_22.setColumns(10);
textField_23 = new JTextField();
textField_23.setBounds(76, 552, 66, 21);
mf2.getContentPane().add(textField_23);
textField_23.setColumns(10);
textField_24 = new JTextField();
textField_24.setBounds(61, 583, 66, 21);
mf2.getContentPane().add(textField_24);
textField_24.setColumns(10);
textField_25 = new JTextField();
textField_25.setBounds(61, 614, 66, 21);
mf2.getContentPane().add(textField_25);
textField_25.setColumns(10);
textField_26 = new JTextField();
textField_26.setBounds(61, 645, 66, 21);
mf2.getContentPane().add(textField_26);
textField_26.setColumns(10);
textField_27 = new JTextField();
textField_27.setBounds(75, 676, 66, 21);
mf2.getContentPane().add(textField_27);
textField_27.setColumns(10);
textField_28 = new JTextField();
textField_28.setBounds(236, 495, 66, 21);
mf2.getContentPane().add(textField_28);
textField_28.setColumns(10);
textField_29 = new JTextField();
textField_29.setBounds(272, 523, 66, 21);
mf2.getContentPane().add(textField_29);
textField_29.setColumns(10);
textField_30 = new JTextField();
textField_30.setBounds(272, 552, 66, 21);
mf2.getContentPane().add(textField_30);
textField_30.setColumns(10);
textField_31 = new JTextField();
textField_31.setBounds(272, 583, 66, 21);
mf2.getContentPane().add(textField_31);
textField_31.setColumns(10);
textField_32 = new JTextField();
textField_32.setBounds(272, 614, 66, 21);
mf2.getContentPane().add(textField_32);
textField_32.setColumns(10);
textField_33 = new JTextField();
textField_33.setBounds(272, 645, 66, 21);
mf2.getContentPane().add(textField_33);
textField_33.setColumns(10);
textField_34 = new JTextField();
textField_34.setBounds(272, 676, 66, 21);
mf2.getContentPane().add(textField_34);
textField_34.setColumns(10);
textField_35 = new JTextField();
textField_35.setBounds(122, 707, 66, 21);
mf2.getContentPane().add(textField_35);
textField_35.setColumns(10);
button_2 = new JButton("\u66F4\u65B0");
button_2.setBounds(369, 675, 93, 23);
mf2.getContentPane().add(button_2);
btnNewButton.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mf2.setVisible(false);
		new Myframe();
	}
	
});
button.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DeleteDemo d=new DeleteDemo();
		String id=textField_1.getText();
		d.Deletesql(id);
		mf2.setVisible(false);
		new Mf2();
		new ChangeFrame();
	}
	
});
button_1.addActionListener(new ActionListener(){

	private Object tabDemo1;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ResultSet rs = null;
		String id=textField_3.getText();
		QueryDemo q=new QueryDemo();
		rs=q.query(id);
		try
		{

		
		int count = 0;
		while(rs.next()){
			info1[count][0] = rs.getString("PID");
			info1[count][1] = rs.getString("PASSWD");
			info1[count][2] = rs.getString("AUTHORITY");
			info1[count][3] = rs.getString("NAME");
			info1[count][4] = rs.getString("SEX");
			info1[count][5] = rs.getString("BIRTHDAY");
			info1[count][6] = rs.getString("DEPARTMENT");
			info1[count][7] = rs.getString("POSITION");
			info1[count][8] = rs.getString("EDU_LEVEL");
			info1[count][9] = rs.getString("SPCIALTY");
			info1[count][10] = rs.getString("ADDRESS");
			info1[count][11] = rs.getString("TEL");
			info1[count][12] = rs.getString("EMAIL");
			info1[count][13] = rs.getString("STATE");
			info1[count][14] = rs.getString("REMARK");;
		
		}
		tabDemo1= new JTable(info1,tableRows);
		jth1 = ((JTable) this.tabDemo1).getTableHeader();
		scpDemo1.setViewportView((Component) tabDemo1);
		mf2.getContentPane().add(scpDemo1);

		rs.close();
		
		}
		catch(Exception e1)
		{
		e1.printStackTrace();
		}
		
		
	}
	
});
btnNewButton_1.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		ResultSet rs = null;
		String id=textField_5.getText();
		QueryDemo q=new QueryDemo();
		rs=q.query(id);
		try {
			while(rs.next()){
				textField_7.setText( rs.getString("PID"));
				textField_22.setText( rs.getString("PASSWD"));
				textField_23.setText( rs.getString("AUTHORITY"));
				textField_24.setText( rs.getString("NAME"));
				textField_25.setText( rs.getString("SEX"));
				textField_26.setText( rs.getString("BIRTHDAY"));
				textField_27.setText( rs.getString("DEPARTMENT"));
				textField_28.setText( rs.getString("POSITION"));
				textField_29.setText( rs.getString("EDU_LEVEL"));
				textField_30.setText( rs.getString("SPCIALTY"));
				textField_31.setText( rs.getString("ADDRESS"));
				textField_32.setText( rs.getString("TEL"));
				textField_33.setText( rs.getString("EMAIL"));
				textField_34.setText( rs.getString("STATE"));
				textField_35.setText( rs.getString("REMARK"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
});
button_2.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String id=textField_5.getText();
		UpdateDemo u=new UpdateDemo();
		u.update(id,textField_22.getText(),textField_23.getText(),textField_24.getText(),textField_25.getText(),textField_26.getText(),textField_27.getText()
				,textField_28.getText(),textField_29.getText(),textField_30.getText(),textField_31.getText(),textField_32.getText(),textField_33.getText(),textField_34.getText()
				,textField_35.getText());
		mf2.setVisible(false);
		new Mf2();
	}
	
});
mf2.repaint();
mf2.validate();
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
