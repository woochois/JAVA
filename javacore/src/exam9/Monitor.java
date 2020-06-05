package exam9;

public class Monitor {
	/*
	5. 텔레비전을 모델하는 Monitor클래스를 설계하라
	텔레비전은 브랜드명(brand) 색상(color)과 화면크기(size)를 가진다
	( 화면크기는 double 로 선언한다 )
	텔레비전이 브랜드명, 모델과 화면크기를 알 수 있는 함수
	GetBrand(),
	GetColor(),
	GetSize()
	브랜드명, 모델, 화면크기를 정할 수 있는 함수를 가진다
	SetBrand(brand),
	SetColor(color),
	SetSize(size)
	*/
	
	static String brand;
	static String color;
	static double size;
	
	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Monitor.brand = brand;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Monitor.color = color;
	}

	public static double getSize() {
		return size;
	}

	public static void setSize(double size) {
		Monitor.size = size;
	}

	public static void main(String[] args) {
		setBrand(brand);
		setColor(color);
		setSize(size);
		
		getBrand();
		getColor();
		getSize();
	}
	
}
