package exam11;

public class TestCalc {

	public static void main(String[] args) {
		CalcUtils cal = new CalcUtils();
		
		cal.setOprands(10, 20);
		cal.sum();
		cal.avg();
		
		cal.setOprands(10, 20, 30);
		cal.sum();
		cal.avg();

		NewCalcUtils ncal = new NewCalcUtils();
		ncal.setOprands(10, 20);
		ncal.sum();
		ncal.avg();
		ncal.substract();
	}
}
