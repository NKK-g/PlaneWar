package com.wowowo.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.accessibility.AccessibleRelation;
import javax.swing.JPanel;

import com.wowowo.thread.DrawableThread;

public class MyPanel extends JPanel {
	
		
	public Image bgImage;
	
	public int timer=0;
	
	public int top=0;
	
	public DrawableThread drawableThread;
	
	public MyPanel()
	{
		this.bgImage=Toolkit.getDefaultToolkit().getImage("images/bg01.jpg");
		
		this.drawableThread=new DrawableThread(this);
		
		this.drawableThread.start();
	}
	
	//注意这里是paintComponent 不是 paintComponents
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.drawImage(bgImage, 0, top-bgImage.getHeight(this), bgImage.getWidth(this), bgImage.getHeight(this), null);
		g.drawImage(bgImage, 0, top, bgImage.getWidth(this), bgImage.getHeight(this), null);
		
		timer++;
		if( timer >= 10000 ){
			timer = 0;
		}
		
		if( timer % 10 == 0 )
		{
			
			this.top+= 1;
			if( top > bgImage.getHeight(this) ){
				top = 0;
			}
		}
		
		
	}
}
