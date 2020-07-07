package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import listener.FrameMouseListener;
import model.Enemy001;
import model.Enemy002;
import model.Enemy003;
import model.Enemy004;
import model.Enemy005;
import model.Enemy006;
import model.Enemy007;
import model.Enemy008;
import model.Enemy009;
import model.Enemy010;

public class BaseFrame extends JFrame {
	
	public static int frameWidth=512;
	
	public static int frameHeight=768;
	
	public MyPanel panel;
	
	public FrameMouseListener frameMouseListener;
	
	
	public void setTouchListener()
	{
		   this.frameMouseListener=new FrameMouseListener();
		   this.frameMouseListener.baseFrame=this;
		   this.addMouseListener(this.frameMouseListener);
	}
	
	
	 public void addEnemyType(Class c)
	 {
		   this.panel.enemiesType.add(c);
	 }
	
	
	public BaseFrame()
	{
	 super("飞机大战");
	 Dimension screenSize=	Toolkit.getDefaultToolkit().getScreenSize();
	 setBounds(((int)screenSize.getWidth()-frameWidth)/2, 0, frameWidth, frameHeight);
	 setLayout(null);	
	 
	 this.panel=new MyPanel();
	 
	 this.panel.setBounds(0, 0, frameWidth, frameHeight);
	 
	 this.add( this.panel);	 
	 
	 //设置飞机跟随鼠标移动
	 setTouchListener();
	 
	 
	 //添加敌机
	 addEnemyType(Enemy001.class);
	 addEnemyType(Enemy002.class);
	 addEnemyType(Enemy003.class);
	 addEnemyType(Enemy004.class);
	 addEnemyType(Enemy005.class);
	 addEnemyType(Enemy006.class);
	 addEnemyType(Enemy007.class);
	 addEnemyType(Enemy008.class);
	 addEnemyType(Enemy009.class);
	 addEnemyType(Enemy010.class);
	 
	 
	 
	 setVisible(true);
	 
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
