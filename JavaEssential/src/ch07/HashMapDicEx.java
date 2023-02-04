package ch07;
import java.util.*;
public class HashMapDicEx {

	public static void main(String[] args) {

		//HashMap<String, String> dic = new HashMap<>();
		var dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//모든 키와 값을 출력
		Set<String> keys = dic.keySet();	// 모든 키를 Set 컬렉션에 받아옴
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {  
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++) {  
			System.out.print("찾을 단어>>");
			String eng = scanner.next();
			
			String kor = dic.get(eng);
			if(kor == null) System.out.println("없는 단어");	//키에 해당하는 값이 없으면 null을 반환
			else System.out.println(kor);
			
		scanner.close();
		}
	}

}
