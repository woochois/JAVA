package exam9;

public class Student {
/*
	4. 학생을 모델하는 Student 클래스를 설계하라.
	학생은 학번(id)과
	이름(name)을 가진다.
	학생의 학번과
	이름을 정할 수 있고 SetId(id), SetName(name)
	학번과
	이름을 가져올 수 있어야 한다 GetId(), GetName()
*/
	static String id;
	static String name;
	

	
	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		Student.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}

	public static void main(String[] args) {	
		setId(id);
		setName(name);
		getId();
		getName();
	}
	
}
