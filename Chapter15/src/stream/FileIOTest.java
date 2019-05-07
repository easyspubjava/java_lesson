package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileIOTest {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("a.out", true); 
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (IOException e) {
			System.out.println(e);
			
		} finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		try{
			fis = 	new FileInputStream("a.out");
			isr = new InputStreamReader(fis);
			
			int ch;
			while( (ch = isr.read()) != -1){
				System.out.print((char)ch);
			}
			
		}catch(IOException e){
			System.out.println(e);
			
		}finally{
			try {
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
