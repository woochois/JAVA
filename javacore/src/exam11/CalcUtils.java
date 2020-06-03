package exam11;

public class CalcUtils {
	
	int left, right, third, result;

	void setOprands(int a, int b){ 
		this.left = a;
		this.right = b;
	}
	
	void setOprands(int a, int b, int c){ // 오버로딩 (기존 생성자와 다르게 새로 만든 생성자 )
		this.left = a;
		this.right = b;
		this.third = c;
	}
	
	int sum() {
		result = left + right + third;
		return result;
	}
	
	double avg() {
		if(third == 0) result = (left + right) / 2;
		else result = (left + right + third) / 3; 
		return result;
	}
}
