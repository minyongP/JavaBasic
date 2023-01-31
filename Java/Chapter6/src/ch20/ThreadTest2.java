package ch20;

class MyThread2 implements Runnable{

	@Override
	public void run() {
			int i;
			for(i=1; i<=200; i++) {
				System.out.println(i + "\t");
			}
	}

}

public class ThreadTest2 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "start");
		MyThread2 runnable = new MyThread2();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("1");
			}
		};
		
		run.run();
	}

}
