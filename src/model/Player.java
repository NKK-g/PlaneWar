package com.wowowo.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Player {
	
	 public MyPanel myPanel;
	 
	 public Image[] images=new Image[]{
			 Toolkit.getDefaultToolkit().getImage("images/player01.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player02.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player03.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player04.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player05.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player06.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player07.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player08.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player09.png")
			 
	 };
	 
	 public int width=100;
	 
	 public int height=100;
	 
	 public int x;
	 
	 public int y;
	 
	 public int imageIndex=0;
	 
	 public int attackMode=0;
	
	 public Player(MyPanel myPanel)
	 {
		  this.myPanel=myPanel;
		      
		  this.x=(BaseFrame.frameWidth-width)/2;
		  
		  this.y=BaseFrame.frameHeight-height*2;
				  
	 }
	 
	 public void drawSelf(Graphics g)
	 {
		   g.drawImage(this.images[imageIndex], x, y, width, height, null);
		   
		   if(this.myPanel.timer%50==0)
		   {
			   imageIndex++;
			   
			   if(imageIndex>=this.images.length)
				   imageIndex=0;
		   }
		   
		 
		  
	 }

}
