package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	String name;
	int age;
	double height;

	void display() {

		System.out.print("이름" + name);
		System.out.print(", 나이" + age);
		System.out.println(", 키" + height);

	}

	public Person(String name, int age, double height) {

		this.name = name;
		this.age = age;
		this.height = height;
	}

}

public class ObjectInputOutputStreamTest {

	public static void main(String[] args) {

		// ObjectInputStream ois;
		// NotSerializableException :Object가 직렬화되지 않아서
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("회원.dat"));) {

			oos.writeObject(new Person("몽여름", 13, 8));

			oos.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("---------------------------------");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("회원.dat"));) {

			Person person = (Person) ois.readObject();
			person.display();
			ois.close();

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();

		}

	}
}
