package ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStreamTest {

	public static void main(String[] args) {

//		int[] arr = {1,2,3,4,5};
//		
//		for(int num : arr) {
//			System.out.println(num);
//		}
//		
//		
//		System.out.println();
////		Arrays.stream(arr).forEach(n-> System.out.println(n));
//		
//		IntStream is = Arrays.stream(arr);
//		is.forEach(n-> System.out.println(n));
//		
//		int sum = Arrays.stream(arr).sum();
//		System.out.println(sum);
		
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.println(n + "\t"));
		System.out.println();
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum = " + sum);
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum2 = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println(sum2);

		
		
	}

}
