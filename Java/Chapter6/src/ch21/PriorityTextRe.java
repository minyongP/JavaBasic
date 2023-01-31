package ch21;

class PriorityThread2 extends Thread{
	
	public void run() {
		
		int sum = 0;
		
		Thread t = Thread.currentThread();
		System.out.println(t + "start");
		
		for(int i=0; i<=1000000; i++) {
			
			sum += i;
		}
		
		System.out.println(t.getPriority() + "end");
	}
}

public class PriorityTextRe {

	public static void main(String[] args) {

		int i;
		for(i=Thread.MIN_PRIORITY; i<=Thread.MAX_PRIORITY; i++) {
			
			PriorityThread2 pt = new PriorityThread2();
			pt.setPriority(i);
			pt.start();
		}
	}

}
