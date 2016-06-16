import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.sql.SQLException;

import javax.swing.UIManager;


public class Myframe extends JFrame{
	String s1=null;
	Myframe(String s1){
		this.s1=s1;
		initGUI();
		
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		  final JFrame mf=new JFrame("人事管理系统");
		  mf.setLocation(660,340);
		  mf.setBackground(Color.BLUE);
		JPanel jp=new JPanel();
		jp.setBackground(Color.GRAY);
		JButton cha=new JButton("人事变动");
		cha.setBounds(161, 221, 150, 30);
		cha.setForeground(Color.GREEN);
		JButton ser=new JButton("\u5458\u5DE5\u7BA1\u7406");
		ser.setBounds(161, 164, 150, 30);
		ser.setForeground(Color.GREEN);
		ser.setBackground(Color.WHITE);
		jp.setLayout(null);
	
		jp.add(ser);
		jp.add(cha);
		mf.getContentPane().add(jp);
		JButton btnNewButton = new JButton("\u4FEE\u6539\u5BC6\u7801");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(161, 280, 150, 30);
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					mf.setVisible(false);
					new Passwd(s1);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		jp.add(btnNewButton);
		JLabel lblNewLabel = new JLabel(new ImageIcon("D:\\sqltest\\fm3.png"));
		lblNewLabel.setBounds(0, 0, 492, 466);
		jp.add(lblNewLabel);
		
		
		mf.setVisible(true);
		mf.setSize(500, 500);
		ser.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.setVisible(false);
				new Mf4(s1);
			}
			
		});
		cha.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.setVisible(false);
				new Mf3();
			}
			
		});
		
		
	}
	}
	
	
