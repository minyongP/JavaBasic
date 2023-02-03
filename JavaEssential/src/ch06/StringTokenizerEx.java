package ch06;
import java.util.StringTokenizer;
public class StringTokenizerEx {

	public static void main(String[] args) {
		//stringbuffer
		//내부에 가변 크기의 버퍼를 가지고 자동 조절한다.
		//스트링의 수정이 가능
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil");
		System.out.println(sb);
		sb.insert(7, " my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		String query = "name=minyong&addr=seoul&age=26";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens();	//분리된 토큰 개수
		System.out.println("토큰 개수 = " +n);
		while(st.hasMoreTokens()) {  			//for(int i=0; i<n; i++)과 동일
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
