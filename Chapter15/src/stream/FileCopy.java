package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCopy {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("a.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		long pseconds;
		int len = 0;
		
		pseconds = System.currentTimeMillis();
		
		int in;
		while( (in = bis.read()) != -1 ){
			bos.write(in);
			len++;
		}
		
		pseconds = System.currentTimeMillis() - pseconds;
		
		bos.close();
		bis.close();
		
		System.out.println("len = " + len + "bytes, time = " + pseconds + "milliseconds");
	
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		new InputStreamReader (new BufferedInputStream(System.in));
		
		
		
		
	}

}
