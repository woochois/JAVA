package exam11;

public class NewCalcUtils extends CalcUtils{
	
	double avg() {  // 오버라이딩 ( 기존 생성자를 재정의 )
		this.result = (left + right) / 2;
		return this.result;
	}
	
	int substract() {
		result = left - right;
		return result;
	}
	
	public static void main(String[] args) {
		NewCalcUtils ncal = new NewCalcUtils();
		ncal.setOprands(10, 20);
		System.out.println(ncal.sum());
		System.out.println(ncal.avg());
		System.out.println(ncal.substract());
		
	}
}
