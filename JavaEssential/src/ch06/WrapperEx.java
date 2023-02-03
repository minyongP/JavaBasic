package ch06;
public class WrapperEx {

	public static void main(String[] args) {
		//char
		System.out.println(Character.toLowerCase('A'));
		char c1='4', c2='F';
		if(Character.isDigit(c1))
			System.out.println(c1 + " is number");
		if(Character.isAlphabetic(c2))
			System.out.println(c2+" is alphabet");
		
		//int
		System.out.println(Integer.parseInt("28"));
		System.out.println(Integer.toString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28)); 		//2진수 1의 개숫
		
		Integer i = Integer.valueOf(28);
		System.out.println(i.doubleValue());	// int -> double
		System.out.println(i);
		
		// double
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		// bool
		boolean b = (4>3); //true
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
		
		// boxing
		Integer ten = 10;	//auto boxing
		//Integer.valueOf(10); 과 동일
		int n = ten;		//auto unboxing
		System.out.println(n);
		//int n = ten.intValue(); 과 동일
	}

}
