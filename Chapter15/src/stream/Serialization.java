package stream;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

class Person implements Externalizable{
	
	File file = new File("a.out");
	
	
	String name;
	transient String grade;
	
	transient Socket socket;
	
	public Person(String name, String grade){
		this.name = name;
		this.grade = grade;
		socket = new Socket();
	}
	
	public String toString(){
		
		
		return  name + "," + grade;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

	/*	Person personHong = new Person("홍길동", "대리");
		Person personLee = new Person("이순신", "과장");
		
		FileOutputStream fos = new FileOutputStream("serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(personHong);
		oos.writeObject(personLee);
		
		oos.close();
		
		FileInputStream fis = new FileInputStream("serial.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person ps1 = (Person)ois.readObject();
		Person ps2 = (Person)ois.readObject();
		
		System.out.println(ps1);
		System.out.println(ps2);
		
		ois.close();
		
		*/
		String s1 = new String("abc");
		String s2 = new String("def");
		
		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		sb.append(s2);
		
		System.out.println(sb.toString());
		
		
	}

}
