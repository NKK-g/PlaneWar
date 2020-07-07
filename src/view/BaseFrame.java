package com.wowowo.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class BaseFrame extends JFrame {
	
	public static int frameWidth=512;
	
	public static int frameHeight=768;
	
	public MyPanel panel;
	
	public BaseFrame()
	{
	 super("·É»ú´óÕ½");
	 Dimension screenSize=	Toolkit.getDefaultToolkit().getScreenSize();
	 setBounds(((int)screenSize.getWidth()-frameWidth)/2, 0, frameWidth, frameHeight);
	 setLayout(null);
	
	 
	 this.panel=new MyPanel();
	 
	 this.panel.setBounds(0, 0, frameWidth, frameHeight);
	 
	 this.add( this.panel);
	 
	 setVisible(true);
	 
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
