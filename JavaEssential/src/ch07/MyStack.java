package ch07;
//제네릭 스택
class GStack<T>{ //제네릭 스택 선언, 제네릭 타입 T 
	int tos;
	Object [] stck;
	public GStack() {  
		tos=0;
		stck = new Object[10];
	}
	public void push(T item) {  
		if(tos == 10) return;	//스택 가득 참
		stck[tos] = item;
		tos++;
	}
	@SuppressWarnings("unchecked")
	public T pop() {  
		if(tos==0) return null;	//스택 빔
		tos--;
		return (T)stck[tos];	// !!타입 매개 변수 타입으로 캐스팅!!
	}
}
public class MyStack {

	public static void main(String[] args) {

		//GStack<String> stringStack = new GStack<String>();
		var stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop());
		}
		
		var intStack = new GStack<Integer>();;
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(intStack.pop());			
		}
	}

}
