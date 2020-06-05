package exam1;

public class Volume {
	public static void main(String[] args) 
	{ 
		int Length = 20; 
		int Width = 30; 
		int Height = 40;
		int Volume;
		Volume = Length * Width * Height;
		System.out.println("가로:\t" + Length );  //  가로:      20  
		System.out.println("세로:\t" + Width ); // 세로:        30
		System.out.println("높이:\t" + Height ); // 높이:        40
		System.out.println("부피:\t" + Volume ); // 부피:        24000
	}
}