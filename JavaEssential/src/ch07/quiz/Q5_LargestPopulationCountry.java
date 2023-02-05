package ch07.quiz;
import java.util.*;
public class Q5_LargestPopulationCountry {

	public static void main(String[] args) {
		var nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 5개 입력하세요.");
		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			nations.put(scanner.next(), scanner.nextInt());
		}
		Set<String> key = nations.keySet();
		Iterator<String> it = key.iterator();
		int max=0;
		String maxNation=null;
		while (it.hasNext()) {
			String key1 = (String) it.next();
			int value = nations.get(key1);
			if(max<value) {
				max=value;
				maxNation=key1;
			}	
		}
		System.out.println("제일 인구가 많은 나라는 (" + maxNation + ", " + nations.get(maxNation) + ")");
		scanner.close();
	}

}
