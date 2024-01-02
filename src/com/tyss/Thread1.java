package com.tyss;

public class Thread1 extends Thread{
	Thread t1;
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				t1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("thread---1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
