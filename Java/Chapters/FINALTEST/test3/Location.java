package test3;

import java.util.Scanner;

public class Location {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      
      System.out.print("x 좌표를 입력하세요: ");	//x좌표 입력
      int x = scanner.nextInt();
      System.out.print("y 좌표를 입력하세요: "); //y좌표 입력
      int y = scanner.nextInt();

      
      if(x>=100 && x<=300) {      //x좌표가 100~300 좌표 안
         if(y>=100 && y<=300) {   //x좌표가 100~300 좌표 안이며, y좌표가 100~300 좌표 안일때
            System.out.println("점 (" + x + ", " + y + ")은 (100, 100)~(300, 300) 영역의 사각형 내에 위치해 있습니다.");
         }
         else               //y좌표가 100~300 좌표 밖
            System.out.println("점 (" + x + ", " + y + ")은 (100, 100)~(300, 300) 영역의 사각형 밖에 위치해 있습니다.");
      }
      else                  //x좌표가 100~300 좌표 밖
         System.out.println("점 (" + x + ", " + y + ")은 (100, 100)~(300, 300) 영역의 사각형 밖에 위치해 있습니다.");
   }
}