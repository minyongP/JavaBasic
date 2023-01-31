package ch14;

public class Subway {

	int lineNumber, passengerCount, money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "라인 지하철의 승객은 " + passengerCount + "명 이고, 수입은" + money + "원 입니다.");
	}
}
