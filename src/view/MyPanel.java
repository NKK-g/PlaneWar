package com.wowowo.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
		
	public Image bgImage;
	
	public MyPanel()
	{
		this.bgImage=Toolkit.getDefaultToolkit().getImage("images/bg01.jpg");
		
				
	}
	
	//注意这里是paintComponent 不是 paintComponents
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.drawImage(bgImage, 0, 0-bgImage.getHeight(this), bgImage.getWidth(this), bgImage.getHeight(this), null);
		g.drawImage(bgImage, 0, 0, bgImage.getWidth(this), bgImage.getHeight(this), null);
		
	}
}
