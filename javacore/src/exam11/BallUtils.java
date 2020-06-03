package exam11;

public class BallUtils extends Shape3dVo{
	
	static int r;

	public BallUtils(int x, int y, int z, int r) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
	}
	
	public int getRadius() {
		return r;
	}

	void CalcVolume() {
		System.out.println(((x / y) * (Math.PI * Math.pow(getRadius(), 3)))); 
	}
	
	public static void main(String[] args) {
		BallUtils bu = new BallUtils(4,3,5,10);
		System.out.print("구하고자 하는 원의 부피는 : ");
		bu.CalcVolume();
		System.out.println("x 좌표 : "+x+" , "+"y 좌표 : "+y+" , "+"z 좌표 : "+z+" , "+"반지름 : "+r);
	}
}
