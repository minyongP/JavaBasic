package test4;

import java.util.Scanner;

public class PhoneApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
         
        PhoneNum [] contact =new PhoneNum[10];      // contact(연락처) 배열 선언
        
        int count = 0;                        // 저장된 연락처 갯수
        for(int i=0; i<contact.length; i++){
            System.out.print("이름:");
            String name = scanner.nextLine();
            if(name.equals("그만"))               // '그만' 입력시 반복 중단
               break;
            else {
            System.out.print("전화번호: ");
            String tel = scanner.nextLine();
            contact[i] =new PhoneNum(name, tel);   // 배열 원소 객체 생성
            count++;
            }
        }
        System.out.println(count + "개의 연락처가 저장되었습니다!");
        

        System.out.print("검색할 이름: ");
        while(true) {
        String search = scanner.nextLine();
        if(search.equals("exit"))					//exit입력시 종료
        	break;
        ///////////////////////////////////////////// 배열 검색

        }

    }
}