package ch06;

public class StringEx {

	public static void main(String[] args) {
		String a = new String("  C#");
		String b = new String(",C++");
		
		System.out.println(a+"길이"+a.length());
		System.out.println(a.contains("#"));//true
		
		a = a.concat(b); //connection
		System.out.println(a);
		
		a = a.trim(); // 앞뒤의 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "Java");
		System.out.println(a);
		
		String s[] = a.split(",");	//문자열 분리                                                                                                                                                                                                                                                                                                                                                                                   
		for(int i=0; i<s.length; i++) 
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a);
		
		char c = a.charAt(2);	//인덱스 2의 문자 리턴
		System.out.println(c);
		
	}

}
