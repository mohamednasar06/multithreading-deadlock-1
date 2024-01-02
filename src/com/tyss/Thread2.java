package com.tyss;

public class Thread2 extends Thread{
	Thread t2;
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("thread 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
