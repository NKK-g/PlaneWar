package thread;


import view.MyPanel;

public class DrawableThread extends Thread{

	public MyPanel mypanel;	
	
	
	public DrawableThread(MyPanel mypanel){
		this.mypanel = mypanel;
	}
	
	//ÿ��һ�����һ�����
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
