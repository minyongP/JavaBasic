package ch05;
import java.util.Scanner;
interface StackInterface{  
	int length();
	String pop();
	boolean push(String ob);
}
class StringStack implements StackInterface{
	String[] ss = new String[5];
	private int count = 0;
	@Override
	public int length() {
		return count;
	}

	@Override
	public String pop() {
		return ss[--count];
	}

	@Override
	public boolean push(String ob) {
		if(count == 5)
			return false;
		else {
			ss[count] = ob;
			count++;
			return true;
		}
	}  
	
}
public class Q5_StackManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringStack s = new StringStack();
		
		System.out.print(">>");
		for(int i=0; i<5; i++) {  
			s.push(scanner.next());
		}
		System.out.println(s.length());
		for(int i=0; i<5; i++) {  
			System.out.print(s.pop() + " ");
		}

	}

}
