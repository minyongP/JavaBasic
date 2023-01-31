package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output3.txt");
		try(fos){
			
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i = 0; i< bs.length; i++) {	//A-Z 입력
				bs[i] = data++;
			}
			
			fos.write(bs, 2, 10);	//배열 2번째부터 10개 바이트 출력
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
