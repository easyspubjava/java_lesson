package lesson15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharacterOutTest {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("out.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write("���ݱ��� �ڹ� ���� ����ְ� �����߾��^^");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("out.txt ������ �������");
	}
}
