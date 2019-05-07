package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) throws IOException {

		System.out.println("다쓰고 '끝'이라고 쓰세요");
		int in;
		
	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		while( (in = isr.read()) != '끝'){
			System.out.print((char)in);
		}
		
	}

}
