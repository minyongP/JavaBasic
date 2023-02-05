package ch07.quiz;
import java.util.*;
public class Q3_OrderCoffee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var coffees = new HashMap<String, Integer>();
		
		coffees.put("에소프레소", 2000);
		coffees.put("아메리카노", 2500);
		coffees.put("카페라떼", 3500);
		coffees.put("카푸치노", 3000);
		
		System.out.println("에소프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		while(true) {  
			System.out.print("주문 >> ");
			String order = scanner.next();
			if(order.equals("그만")) break;
			System.out.println(order + "는 " + coffees.get(order) + "입니다.");
		}
	}

}
