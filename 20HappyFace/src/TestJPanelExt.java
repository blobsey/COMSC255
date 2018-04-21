//Assignment #: 20

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJPanelExt implements ActionListener{
	JFrame jfMain = new JFrame();
	FlowLayout gl = new FlowLayout();
	JPanelExt jpExtHp = new JPanelExt();
	JPanel jpButtons = new JPanel();
	JButton jbHappy = new JButton("Happy");
	JButton jbSad = new JButton("Sad");
	
	public static void main(String[] args)
	{
		TestJPanelExt a = new TestJPanelExt();
	}
	
	
	public TestJPanelExt()
	{
		jbHappy.addActionListener(this);
		jbSad.addActionListener(this);
		
		jfMain.setLayout(gl);
		jpExtHp.setSize(400, 400);
		jfMain.add(jpExtHp);
		
		jpButtons.setSize(100, 100);
		jpButtons.add(jbHappy);
		jpButtons.add(jbSad);
		//jfMain.add(jpButtons);
		
		jfMain.setSize(500, 500);
		jfMain.setVisible(true);
		jfMain.paint(null);
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
	}
}
