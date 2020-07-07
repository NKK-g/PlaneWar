package view;


import thread.BulletMusicThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new BaseFrame();
		
		new BulletMusicThread("video/bjmusic.wav").start();
		
		

	}

}
