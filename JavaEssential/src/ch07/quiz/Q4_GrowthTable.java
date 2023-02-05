package ch07.quiz;
import java.util.*;
public class Q4_GrowthTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var table = new Vector<Integer>();
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		for (int i = 0; i < 10; i++) {
			table.add(scanner.nextInt());
		}

		double max=0;;
		int year=0;
		for (int i = 0; i < 9; i++) {
			if(max < table.get(i+1) - table.get(i)) {
				max=table.get(i+1) - table.get(i);
				year = i;
			}
		}
		System.out.println("가장 키가 많이 자란 년도는 " + (2000+year) + "년 " + max + "cm");
		scanner.close();
	}

}
