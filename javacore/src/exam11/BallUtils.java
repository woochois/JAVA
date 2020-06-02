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
		result = ((x / y) * (3.14 * Radius));
		return result;
	}
	
	public static void main(String[] args) {
		BallUtils bu = new BallUtils(4,3,5,10);
		System.out.println(bu.CalcVolume());
		System.out.println(x+","+y+","+z+","+Radius);
	}
}
