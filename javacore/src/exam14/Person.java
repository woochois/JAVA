package exam14;

import java.util.*;

public class Person {
	
	int age;
	String name;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
	public static void main(String[] args) {
		
		Vector family = new Vector();
		
		// 나이 및 이름 삽입
		Person grandFa = new Person("김건빵", 80);
		Person grandMo = new Person("장미꽃", 82);
		Person fa = new Person("김식빵", 58);
		Person mo = new Person("크림빵", 57);
		Person sister = new Person("김전병", 26);
		Person brother = new Person("김지짐", 20);

		// Vector 추가
		family.add(grandFa);
		family.add(grandMo);
		family.add(fa);
		family.add(mo);
		family.add(sister);
		family.add(brother);
		
		for(int i = 0; i < family.size(); i++) {
			System.out.println(family.get(i));
		}
		
	}
}

