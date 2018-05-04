//Assignment #: 20

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJPanelExt implements ActionListener{
	JFrame jfMain = new JFrame();
	BorderLayout bl = new BorderLayout();
	JPanel jpMain = new JPanel();
	JPanelExt jpExtHp = new JPanelExt();
	JPanel jpButtons = new JPanel();
	JButton jbHappy = new JButton("Happy");
	JButton jbSad = new JButton("Sad");
	JButton jbPicture = new JButton("Picture");
	
	public static void main(String[] args)
	{
		TestJPanelExt a = new TestJPanelExt();
	}
	
	
	public TestJPanelExt()
	{
		jfMain.setContentPane(jpMain);
		jfMain.setSize(500, 500);
		jfMain.setVisible(true);
		jpMain.setLayout(bl);
		jpExtHp.setSize(100, 100);
		
		
		jpMain.add(jpExtHp, BorderLayout.CENTER);
		
		jbHappy.addActionListener(this);
		jbSad.addActionListener(this);
		jpButtons.add(jbHappy);
		jpButtons.add(jbSad);
		jpMain.add(jpButtons, BorderLayout.SOUTH);
		
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbHappy)
		{
			jpExtHp.setPictureType("Happy");
			jfMain.repaint();
		}
		else if(e.getSource() == jbSad)
		{
			jpExtHp.setPictureType("Sad");
			jfMain.repaint();
		}
		else if(e.getSource() == jbPicture)
		{
			jpExtHp.setPictureType("Picture");
			jfMain.repaint();
		}
	}
}
