package ch14;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {		//버스 번호
		this.busNumber = busNumber;
	}
	
	public void take(int money) { 	//승차 요금
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은" + money + "원 입니다.");
	}
}
