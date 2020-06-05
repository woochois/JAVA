package exam13;

public class College extends Student{

	public College() {
		this.name = name;
	}
	
	@Override
	public void computeGrade() {
		if(score>=90) {
			grade = "A";
		}else if(score>=80) {
			grade = "B";
		}else if(score>=70) {
			grade = "C";
		}else {
			grade = "F";
		}
	}
	
	public static void main(String[] args) {
		// Student boy = new Student(); 추상클래스는 선언 불가
		College choi = new College();
		choi.score=90; // 수학점수
		choi.computeGrade();
		System.out.println(choi.grade);
	}
}
