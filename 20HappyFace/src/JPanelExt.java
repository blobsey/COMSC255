//Assignment #: 20

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

import java.awt.*;
import javax.swing.*;
import java.net.*;

public class JPanelExt extends JPanel{
	
	private String pictureType;
	ImageIcon pic;
	int picNum;
	URL imgpath;
	Image image;
	
	public JPanelExt() {
		super();
		pictureType = "Happy";
		picNum = -1;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (pictureType.equals("Happy")) {
			g.setColor(Color.yellow);
		    g.fillOval(0,0,300,300);
		    g.setColor(Color.RED);
		    g.fillOval(80,75,30,30);
		    g.fillOval(190,75,30,30);
		    g.setColor(Color.black);
		    g.fillArc (75,100,150,150,0,-180);
		}
		else if(pictureType.equals("Sad")) {
	        g.setColor(Color.GREEN);
	        g.fillOval(0,0,300,300);
	        g.setColor(Color.black );
	        g.fillOval(80,75,30,30);
	        g.fillOval(190,75,30,30);
	        g.setColor(Color.black);
	        g.drawArc(75,150,150,150,0,180);
		}
		else if(pictureType.equals("Picture")) {
			g.drawImage(image, 0, 0, pic.getIconWidth(), pic.getIconWidth(), this);

			
		}
	}
	
	public void setPictureType(String pictureType) {
		this.pictureType = pictureType;
		if(pictureType.equals("Picture"))
		{
			int picNumBuf = (int)(Math.random() * 4) + 1;
			while(picNumBuf == picNum)
				picNumBuf = (int)(Math.random() * 4) + 1;
			picNum = picNumBuf;
			imgpath = getClass().getResource("" + picNum + ".gif");
			pic = new ImageIcon(imgpath);
			image = pic.getImage();
		}
		repaint();
	}
	
}
