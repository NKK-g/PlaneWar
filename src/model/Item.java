package com.wowowo.model;

import java.awt.Graphics;
import java.awt.Image;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Item {
	
	 public MyPanel myPanel;
	 
	 public int width;
	 
	 public int height;
	 
	 public int x;
	 
	 public int y;
	 
	 public Image[] images;
	 
	 public int imageindex=0; 
	 
	 public int speed;
	 
	 public int imageSpeed;
	 
	 
	 public Item(MyPanel myPanel)
	 {
		 this.myPanel=myPanel;		 
	 }
	 
	 public void drawSelf(Graphics g)
	 {
		 g.drawImage(images[imageindex],x, y,width, height,null);
		 
		 if(myPanel.timer%imageSpeed==0)
		 {
			 imageindex++;
			 
			 if(imageindex==this.images.length)
				  imageindex=0;		 
			 
		 }
		 
		 if(myPanel.timer%speed==0)
		 {
			  y++;
			  
			  if(y>=BaseFrame.frameHeight)
			       this.myPanel.items.remove(this);
		 }
	 }
	 
	 public void eated()
	 {
		   this.myPanel.items.remove(this);
	 }

}
