package ch07.quiz;
import java.util.*;
public class Q1_BiggestVector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var v = new Vector<Double>(5);
		for (int i = 0; i < v.capacity(); i++) {
			v.add(scanner.nextDouble());
		}
		double max=0;
		for (int i = 0; i < v.capacity(); i++) {
			Double temp = v.get(i);
			if(temp>max) max=temp;
		}
		System.out.println(max);
		scanner.close();
	}

}
