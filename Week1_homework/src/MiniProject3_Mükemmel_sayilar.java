package WEEK1;

public class MiniProject3_Mükemmel_sayilar {

	public static void main(String[] args) {
		int count = 678 ;
		int divisor  = 0;
		
		for (int i = 1; i < count; i++) {
			if (count%i==0) {
				divisor += i; 
				
			}
			
		}
		if (divisor== count) {
			System.out.println("Perfect Number");
			
		}
		else {
			System.out.println("This is not perfect number.");
		}

	}
}
