import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Myframe1 extends JFrame{
	Myframe1(){
		initGUI();
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		  final JFrame mf=new JFrame("人事管理系统");
		  mf.setLocation(660,340);
		  mf.setBackground(Color.BLUE);
		JPanel jp=new JPanel();
		jp.setBackground(Color.GRAY);
		 
		
		
		JButton ad=new JButton("添加员工");
		ad.setBounds(161, 225, 150, 30);
		ad.setForeground(Color.GREEN);
		JButton cha=new JButton("人事变动");
		cha.setBounds(161, 283, 150, 30);
		cha.setForeground(Color.GREEN);
		JButton ser=new JButton("\u5458\u5DE5\u7BA1\u7406");
		ser.setBounds(161, 164, 150, 30);
		ser.setForeground(Color.GREEN);
		ser.setBackground(Color.WHITE);
		jp.setLayout(null);
	
		jp.add(ser);
		jp.add(ad);
		jp.add(cha);
		mf.getContentPane().add(jp);
		
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
	
	
