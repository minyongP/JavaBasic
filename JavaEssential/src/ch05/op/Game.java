package ch05.op;
import java.util.Scanner;
public class Game {
	Scanner scanner = new Scanner(System.in);
	char[][] map = new char[10][20];	// 10*20 map
	Bear bear;
	Fish fish;
	
	public void drawMap() {
		//맵 기본 설정
		for(int i=0; i<10; i++) {  
			for(int j=0; j<20; j++) {  
				map[i][j] = '-';
			}
		}
		// 곰과 물고기 배치
		map[fish.getX()][fish.getY()] = fish.getShape();
		map[bear.getX()][bear.getY()] = bear.getShape();
		//맵 그리기
		for(int i=0; i<10; i++) {  
			for(int j=0; j<20; j++) {  
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[] moveFish() {
		int array[] = {0, 0, 0, 0, 0};
		int count = 0;
		
		while(true) {  
			int index = (int)(Math.random()*4);
			
			if(array[index] == 0) { 
				array[index] = 1;
				count++;
			}
			if(count == 2)
				break;
			}
		return array;
		
	}
	public void run() {  
		System.out.println("'Bear catch the fish' game start");
		
		//bear setting
		System.out.print("input bear start x>>");
		int bearX = scanner.nextInt();
		System.out.print("input bear start y>>");
		int bearY = scanner.nextInt();
		System.out.print("input bear distance>>");
		int bearDistance = scanner.nextInt();
		
		bear = new Bear(bearX, bearY, bearDistance);
		
		fish = new Fish((int)(Math.random()*10), (int)(Math.random()*20), 1);
		
		drawMap();
		
		int[] moveFishs = moveFish();	//fish 배열을 받아 5번중 2번 움직임 확인
		int index = 0;
		
		while(true) {  
			bear.move();
				
			if(moveFishs[index] == 1)
				fish.move();
			index++;
			if(index == 5) {  //5회 초과시 fish배열 리셋
				moveFishs = moveFish();
				index = 0;
			}
			
			drawMap();
			
			// 승리
			if(bear.collide(fish)) {  
				System.out.println("win!");
				break;
			}
		
		}
	}

	public static void main(String[] args) {
		Game game= new Game();
		game.run();
	}

}
