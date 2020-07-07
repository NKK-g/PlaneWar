package com.wowowo.thread;


import com.wowowo.view.MyPanel;

public class DrawableThread extends Thread{

	public MyPanel mypanel;	
	
	
	public DrawableThread(MyPanel mypanel){
		this.mypanel = mypanel;
	}
	
	//每隔一秒绘制一下面板
	public void run(){
		while(true){
			
			mypanel.repaint();

			try {
				Thread.currentThread().sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
