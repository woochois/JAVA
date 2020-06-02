package exam11;

public class BallUtils extends Shape3dVo{
	
	static int Radius;
	double result;

	public BallUtils(int x, int y, int z, int Radius) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.Radius = Radius;
	}
	
	public int getRadius() {
		return Radius;
	}

	double CalcVolume() {
		result = ((x / y) * (3.14 * Math.pow(Radius, 3)));
		return result;
	}
	
	public static void main(String[] args) {
		BallUtils bu = new BallUtils(4,3,5,10);
		System.out.print("구하고자 하는 원의 부피는 : ");
		System.out.println(bu.CalcVolume());
		System.out.println("x 좌표 : "+x+" , "+"y 좌표 : "+y+" , "+"z 좌표 : "+z+" , "+"반지름 : "+Radius);
	}
}
