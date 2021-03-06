
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class MainClass {
	

	public static void converter() {
	
		JFrame frame =new JFrame("Converter");
		
		JLabel l1,l2;
		JTextField tF1,tF2;
		JButton b1=new JButton("EUR");
		JButton b2=new JButton("DIN");
		JButton b3=new JButton("Close");
		
		
		
		l1=new JLabel("Euro: ");
		l1.setBounds(20,40,60,30);
		l2=new JLabel("Dinar: ");
		l2.setBounds(180,40,60,30);
		
		tF1=new JTextField("0");
		tF1.setBounds(80, 40, 100, 30);
		tF2=new JTextField("0");
		tF2.setBounds(240, 40, 100, 30);
		
		b1.setBounds(50, 80, 100, 30);
		b2.setBounds(190, 80,100, 30);
		b3.setBounds(150, 150, 100, 30); 
		//add label
		frame.add(l1);
		frame.add(l2);
		//add textField
		frame.add(tF1);
		frame.add(tF2);
		//add button
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		
		
		frame.setSize(500,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double d=Double.parseDouble(tF1.getText());
				double d1= (d*120);
				String str1= String.valueOf(d1);
				tF2.setText(str1);
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double f = Double.valueOf(tF2.getText());
				double f1=((f/120)%100);
				String str2 =String.valueOf(f1);
				tF1.setText(str2);

			}
		});
	
		
		
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
	
		frame.addWindowListener(new WindowAdapter() {
		public void windowsClosing(WindowEvent e) {
			System.exit(0);
		}
		
		});

}

public static void main (String[]args) {
	converter();

}
}