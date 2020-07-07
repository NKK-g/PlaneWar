package com.wowowo.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.wowowo.listener.FrameMouseListener;
import com.wowowo.listener.FrameMouseMotionListener;

public class BaseFrame extends JFrame {
	
	public static int frameWidth=512;
	
	public static int frameHeight=768;
	
	public MyPanel panel;
	
	public FrameMouseListener frameMouseListener;
	
//	public FrameMouseMotionListener frameMouseMotionListener;
	
	public void setTouchListener()
	{
		   this.frameMouseListener=new FrameMouseListener();
		   this.frameMouseListener.baseFrame=this;
		   this.addMouseListener(this.frameMouseListener);
	}
	
//	public void setMouseMotionListener()
//	{
//		   this.frameMouseMotionListener=new FrameMouseMotionListener();
//		   this.frameMouseMotionListener.baseFrame=this;
//		   this.addMouseMotionListener(this.frameMouseMotionListener);
//	}
	
	public BaseFrame()
	{
	 super("·É»ú´óÕ½");
	 Dimension screenSize=	Toolkit.getDefaultToolkit().getScreenSize();
	 setBounds(((int)screenSize.getWidth()-frameWidth)/2, 0, frameWidth, frameHeight);
	 setLayout(null);	
	 
	 this.panel=new MyPanel();
	 
	 this.panel.setBounds(0, 0, frameWidth, frameHeight);
	 
	 this.add( this.panel);	 
	 
	 setTouchListener();
	 
	 //setMouseMotionListener();
	 
	 setVisible(true);
	 
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
