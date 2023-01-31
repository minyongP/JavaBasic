package ch14;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러개를 쓰고 enter를 누르세요");

		int i;
		try {
			while( (i = System.in.read()) != '\n') {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
