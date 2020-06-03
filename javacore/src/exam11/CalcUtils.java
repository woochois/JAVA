package exam11;

public class CalcUtils {
	
	int left, right, third;

	void setOprands(int a, int b){ 
		this.left = a;
		this.right = b;
	}
	
	void setOprands(int a, int b, int c){ // 오버로딩 (기존 생성자와 다르게 새로 만든 생성자 )
		this.left = a;
		this.right = b;
		this.third = c;
	}
	
	void sum() {
		System.out.println(left + right + third);
	}
	
	void avg() {
		if(third == 0) System.out.println((left + right) / 2);
		else System.out.println((left + right + third) / 3); 

	}
}
