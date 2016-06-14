import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;


public class Myframe extends JFrame{
	private JTextField textField;
	Myframe(){
		initGUI();
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		  final JFrame mf=new JFrame("人事管理系统");
		JPanel jp=new JPanel();
		jp.setLayout(null);
		JButton ad=new JButton("添加员工");
		JButton cha=new JButton("人事变动");
		JButton ser=new JButton("\u5458\u5DE5\u7BA1\u7406");
		
		jp.add(ser);
		jp.add(ad);
		jp.add(cha);
		mf.getContentPane().add(jp);
		ser.setBounds(180, 209, 150, 30);
		ad.setBounds(180, 249, 150, 30);
		cha.setBounds(180, 289, 150, 30);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(SystemColor.activeCaption);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 22));
		textField.setText("    \u4EBA\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		textField.setBounds(164, 31, 191, 85);
		jp.add(textField);
		textField.setColumns(10);
		mf.setVisible(true);
		mf.setSize(500, 500);
		ser.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.setVisible(false);
				new Mf2();
			}
			
		});
		ad.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.setVisible(false);
				new Mf1();
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
	
	
