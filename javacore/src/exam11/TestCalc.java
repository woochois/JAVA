package exam11;

public class TestCalc {

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
