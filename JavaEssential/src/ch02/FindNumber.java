package ch02;
import java.util.Scanner;
public class FindNumber {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ã¶¼ö >> ");
	        String a = scanner.next();
	        System.out.print("¿µÈñ >> ");
	        String b = scanner.next();

	        if(a.equals("°¡À§")){
	            if(b.equals("°¡À§")){System.out.println("ºñ±è");}
	            else if(b.equals("¹ÙÀ§")){System.out.println("¿µÈñ ½Â");}
	            else if(b.equals("º¸")){System.out.println("Ã¶¼ö ½Â");}
	        }
	        else if(a.equals("¹ÙÀ§")){
	            if(b.equals("°¡À§")){System.out.println("Ã¶¼ö ½Â");}
	            else if(b.equals("¹ÙÀ§")){System.out.println("ºñ±è");}
	            else if(b.equals("º¸")){System.out.println("¿µÈñ ½Â");}
	        }
	        else if(a.equals("º¸")){
	            if(b.equals("°¡À§")){System.out.println("¿µÈñ ½Â");}
	            else if(b.equals("¹ÙÀ§")){System.out.println("Ã¶¼ö ½Â");}
	            else if(b.equals("º¸")){System.out.println("ºñ±è");}
	        }
	    }
	}