package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) throws IOException {

		System.out.println("�پ��� '��'�̶�� ������");
		int in;
		
	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		while( (in = isr.read()) != '��'){
			System.out.print((char)in);
		}
		
	}

}
