package exam11;

public class Shape2dVo {
	static int x;
	static int y;
	
	void Shape2dVo(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Shape2dVo() {
		Shape2dVo(0, 0);
	}	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] args) {
		Shape2dVo circle = new Shape2dVo();
		circle.Shape2dVo(10, 5);
		System.out.println("("+x+","+y+")");
	}
}
