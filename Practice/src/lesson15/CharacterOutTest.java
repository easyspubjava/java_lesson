package lesson15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharacterOutTest {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("out.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write("지금까지 자바 정말 재미있게 공부했어요^^");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("out.txt 파일을 열어보세요");
	}
}
