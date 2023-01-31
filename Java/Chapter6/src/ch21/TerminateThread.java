package ch21;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	private boolean flag = false;		//플래그를 거짓으로둠
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		
		while(!flag) {
			try {
				sleep(100);		//0.1초 지연
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "end");
		
	}
	public void setFlag(boolean flag) {		//플레그 종료 함수
		this.flag = flag;
	}

	public static void main(String[] args) throws IOException {

		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");

		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;	//입력
		while(true) {						//쓰레드 종료 스위치
			in = System.in.read();
			if(in == 'A') {
				threadA.setFlag(true);
			}else if(in == 'B') {
				threadB.setFlag(true);
			}else if(in == 'C') {
				threadC.setFlag(true);
			}else if(in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}else {
				System.out.println("rerere");
			}
		}
		System.out.println("main end");
	}

}
