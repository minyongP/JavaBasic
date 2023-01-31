package ch03;
import java.util.Scanner;
public class Q2_Multiple3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.print("정수 10개 입력>>");
        
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 3 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
    }
}
