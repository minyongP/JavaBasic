package ch07.quiz;
import java.util.*;

class Word{
	String eng, kor;
	public Word(String eng, String kor){  
		this.eng=eng; this.kor=kor;
	}
	public String getEng() {return eng;}
	public String getKor() {return kor;}
}

public class OP_WordQuiz {
	Vector<Word> v = new Vector<Word>();	//point vector
	Scanner scanner = new Scanner(System.in);
	Random rand = new Random();
	int[] quizs = new int[4];
	
	public OP_WordQuiz() {  
		setVector();
		System.out.println("영어 어휘 테스트를 시작합니다. 1~4 외 다른 입력시 종료합니다.");
		System.out.println("현재" + v.size() + "개 단어가 있습니다.");
		game();
	}
	public void game() {  
		while(true) {  
			setQuiz();
			int answer = rand.nextInt(4); 
			int answerIndex = quizs[answer];	//배열의 문제중 정답선택
			System.out.println(v.get(answerIndex).getEng()+"?");
			
			for (int i = 0; i < quizs.length; i++) {
				System.out.print("(" + (i+1) + ") ");
				System.out.print(v.get(quizs[i]).getKor() + " ");
			}
			System.out.print(">> ");
			
			int choice = scanner.nextInt();
			if(choice-1 == answer) {  
				System.out.println("Excellent !!");
			}
			else if(choice>0 && choice<5 && choice != answer) {  
				System.out.println("no. !!");
			}
			else {
				return;
			}
		}
	}
	
	public void setQuiz() {  
		for(int i=0; i<4; i++) {  
			quizs[i] = rand.nextInt(v.size());
			for (int j = 0; j < i; j++) {
				if(quizs[i] == quizs[j]) {	//중복되게 나오면 다시
					i--;
					continue;
				}
			}
		}
	}
	
	public void setVector() {  
		v.add(new Word("culture", "문화"));
		v.add(new Word("experience", "경험"));
		v.add(new Word("education", "교육"));
		v.add(new Word("symbol", "상징"));
		v.add(new Word("effect", "결과"));
		v.add(new Word("liberty", "자유"));
		v.add(new Word("affair", "사건"));
		v.add(new Word("comfort", "안락"));
		v.add(new Word("tradition", "전통"));
		v.add(new Word("subject", "주제"));
	}
	
	public static void main(String[] args) {
		new OP_WordQuiz();
	}
}
