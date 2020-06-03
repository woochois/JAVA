package exam11;

public class NewCalcUtils extends CalcUtils{
	
	void avg() {  // 오버라이딩 ( 기존 생성자를 재정의 )
		System.out.println((left + right) / 2); 
	}
	 
	void substract() {
		System.out.println(left - right);
	}
}
