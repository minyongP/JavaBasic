package ch03;
import java.util.Scanner;
public class Q5_Sorted {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arrayNum = new int[10];
		System.out.println("integer 10 >>");
		for(int i=0; i<arrayNum.length; i++) {
			arrayNum[i] = scanner.nextInt();
		}
		
		for(int i=0; i<arrayNum.length;i++) {
			for(int j=0; j<arrayNum.length; j++) {
				if(arrayNum[i] > arrayNum[j]) {
					int temp = arrayNum[i];
					arrayNum[i] = arrayNum[j];
					arrayNum[j] = temp;
				}
			}
		}
		for(int i:arrayNum) {
			System.out.print(i+" ");
		}
		scanner.close();
	}

}
