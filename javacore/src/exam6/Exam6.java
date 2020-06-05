package exam6;

public class Exam6 {

	public static void main(String[] args) {
		
//		[내 코드]
		
		 int res = 0;
		
		 for(int i = 1; i < 6; i++) {
			 for(int k = 1; k < 6; k++) {
				 if(i == k) res = i * k;
				 else res = 0;
				 System.out.print(res + " ");
			 }System.out.println("");
		 }
		 
//		 [선생님 코드]
		 
		 int result = 0;
		 
		 for(int i=1; i<=5; i++) {
			 
			 for(int k=1; k<=5; k++) {
				 
				 if(i==k) {
					 result=i*k;
				 }else {
					 result=0;
				 }
				 System.out.print(result + " ");
			 }
			 System.out.println("");
		 }
		 
	}

}
