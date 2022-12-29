package ch14;

public class Student {

	String studentName;
	int money;
	
	public Student(String stuentName, int money) {
		this.studentName = stuentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은 " + money + "원 입니다.");
	}
}
