package com.sk.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private transient String pass;
    
	private void writeObject(ObjectOutputStream os)throws Exception
	{
		os.defaultWriteObject();
		String ePass = "123" + pass;
		os.writeObject(ePass);
	}

	private void readObject(ObjectInputStream os)throws Exception{
		os.defaultReadObject();
		String ePass = (String) os.readObject();
		pass = ePass.substring(3);
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", pass=" + pass + "]";
	}

	public Student(int id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
}

public class SerializationAnsDeSerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// create Object
		Student S1 = new Student(1, "Sandeep");
		List<Student> students = Arrays.asList(new Student(1, "sk1"), new Student(2, "sk2"), new Student(3, "sk3"),
				new Student(4, "sk4"), new Student(5, "sk5"), new Student(6, "sk6"), new Student(7, "sk7"),
				new Student(8, "sk8"));
		System.out.println("Start Serialization... ");
		// OOS to FOS
		FileOutputStream fos = new FileOutputStream("abc.text");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		for (Student s : students) {
			os.writeObject(s);
			os.flush();
		}
		os.close();
		System.out.println("Done !");

		System.out.println("Start De-Serialization... ");
		FileInputStream fis = new FileInputStream("abc.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s1 = (Student) ois.readObject();
		while (s1 != null) {
			System.out.println(s1);
			s1 = (Student) ois.readObject();
		}
		ois.close();
		System.out.println("Done !");
	}
}
