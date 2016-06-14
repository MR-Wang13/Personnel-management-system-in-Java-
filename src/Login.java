import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;


public class Login extends JFrame{
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	Login(){
		initGUI();
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		  final JFrame mf=new JFrame("登陆界面");
		JPanel jp=new JPanel();
		jp.setLayout(null);
		JButton ad=new JButton("员工号");
		JButton ser=new JButton("密码");
		jp.add(ser);
		jp.add(ad);
		mf.getContentPane().add(jp);
		ser.setBounds(63, 245, 110, 30);
		ad.setBounds(63, 197, 110, 30);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 202, 195, 21);
		jp.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(224, 250, 195, 21);
		jp.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(Color.BLUE);
		textField.setBackground(Color.YELLOW);
		textField.setText("      \t               \u4EBA\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		textField.setBounds(73, 121, 356, 52);
		jp.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(Color.YELLOW);
		textField_3.setForeground(Color.BLUE);
		textField_3.setText("      \t               \u4EBA\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		textField_3.setBounds(72, 318, 357, 45);
		jp.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("\u9000\u51FA");
		button.setBounds(73, 285, 93, 23);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.dispose();
			}});
		jp.add(button);
		
		JButton btnNewButton = new JButton("\u767B\u9646");
		btnNewButton.setBounds(338, 285, 93, 23);
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1=textField_1.getText();
				String s2=textField_2.getText();
				Logintest l=new Logintest();
				int flag=0;
				flag=l.find(s1, s2);
				if(flag==1){
				mf.setVisible(false);
				new Myframe();
				}
				else
					JOptionPane.showConfirmDialog(mf, "用户名或者密码错误！","错误通知", 0);
			}});
		jp.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.BLUE);
		textField_4.setForeground(Color.RED);
		textField_4.setText("                                             \u6B22\u8FCE\u767B\u9646\uFF01\uFF01");
		textField_4.setBounds(80, 10, 328, 75);
		jp.add(textField_4);
		textField_4.setColumns(10);
		mf.setVisible(true);
		mf.setSize(500, 500);
		
		
		
		
	}
	}
	
	
