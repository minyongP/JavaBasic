package ch14;

public class TaikTransTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee", 5000);
		Student studentKim = new Student("Kim", 10000);
		
		Bus bus100 = new Bus(100);
		
		Subway subwayGreen = new Subway(2);
		
		studentLee.takeBus(bus100);
		studentKim.takeSubway(subwayGreen);
		
		studentLee.showInfo();
		studentKim.showInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
		}

}
