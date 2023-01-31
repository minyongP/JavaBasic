package ch21;

public class JoinTest extends Thread{
	
	int start, end, total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		
		int i;
		for(i= start; i<=end; i++) {
			total += i;
		}
	}

	public static void main(String[] args) {

		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
		}catch(InterruptedException e) {	//Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때 interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
			System.out.println(e);
		}
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal);
		

	}

}
