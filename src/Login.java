import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JLabel;


public class Login extends JFrame{
	private JTextField textField_1;
	private JTextField textField_2;
	
	String s1=null;
	String s2=null;
	Login(){
		initGUI();
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		  final JFrame mf=new JFrame("登陆界面");
		  mf.setLocation(660,340);
		JPanel jp=new JPanel();
		jp.setLayout(null);
		JButton ad=new JButton("员工号");
		ad.setForeground(Color.BLUE);
		JButton ser=new JButton("密码");
		ser.setForeground(Color.BLUE);
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
		
		JButton button = new JButton("\u9000\u51FA");
		button.setForeground(Color.RED);
		button.setBounds(73, 285, 93, 23);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.dispose();
			}});
		jp.add(button);
		
		JButton btnNewButton = new JButton("\u767B\u9646");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(371, 285, 93, 23);
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				s1=textField_1.getText();
				s2=textField_2.getText();
				Logintest l=new Logintest();
				int flag=0;
				flag=l.find(s1, s2);
				if(flag==1){
				mf.setVisible(false);
				new Myframe(s1);
				}
				else
					JOptionPane.showConfirmDialog(mf, "用户名或者密码错误！","错误通知", 0);
			}});
		jp.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("\u7BA1\u7406\u5458\u8EAB\u4EFD\u767B\u9646");
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setBounds(187, 285, 161, 23);
		btnNewButton_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				s1=textField_1.getText();
				s2=textField_2.getText();
				Logintest l=new Logintest();
				int flag=0;
				flag=l.find(s1, s2);
				if(flag==1){
				mf.setVisible(false);
				new Myframe1();
				}
				else
					JOptionPane.showConfirmDialog(mf, "用户名或者密码错误！","错误通知", 0);
			}
			
		});
		jp.add(btnNewButton_1);
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("D:\\sqltest\\fm2.png"));
		lblNewLabel_1.setText("");
		lblNewLabel_1.setBounds(103, 81, 299, 91);
		jp.add(lblNewLabel_1);
		JLabel lblNewLabel = new JLabel(new ImageIcon("D:\\sqltest\\fm1.png"));
		lblNewLabel.setBounds(0, 0, 492, 466);
		jp.add(lblNewLabel);
		
		
		
		
		mf.setVisible(true);
		mf.setSize(500, 500);
		
		
		
		
	}
	}
	
	
