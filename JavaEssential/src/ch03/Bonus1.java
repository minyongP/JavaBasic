package ch03;

public class Bonus1 {

	public static void main(String[] args) {
		int intarr[][] = intarr = new int[3][4];
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<4; j++) {  
				intarr[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<4; j++) {  
				System.out.print(intarr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int i=0, sum=0;
		while(i<3) {
			for(int j=0; j<4; j++) {  
				sum += intarr[i][j];
			}
			i++;
		}
		System.out.println("sum= " +sum);
	}

}
