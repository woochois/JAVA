package exam11;

public class CalcUtils {
	
	int left, right, third, result;

	void setOprands(int a, int b){
		this.left = a;
		this.right = b;
	}
	
	void setOprands(int a, int b, int c){
		this.left = a;
		this.right = b;
		this.third = c;
	}
	
	int sum() {
		result = left + right + third;
		return result;
	}
	
	double avg() {
		result = (left + right + third) / 3;
		return result;
	}
	
	public static void main(String[] args) {
		CalcUtils cal = new CalcUtils();
		
		cal.setOprands(10, 20);
		System.out.println(cal.sum());
		System.out.println(cal.avg());
		
		cal.setOprands(10, 20, 30);
		System.out.println(cal.sum());
		System.out.println(cal.avg());

	}
	
}
