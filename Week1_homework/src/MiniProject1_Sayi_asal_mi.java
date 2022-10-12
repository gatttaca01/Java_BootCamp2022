package WEEK1;

public class MiniProject1_Sayi_asal_mi {

	public static void main(String[] args) {
		int count = 3 ;
		
		boolean isprime = true;
		
		for (int i = 2; i < count; i++) {
			if (count % i ==0) {
				isprime = false;
			
			}
			
		}
		
		if (isprime) {
			System.out.println(count + " is prime");
		}
		else {
			System.out.println(count +" is not prime");

	}

}
}
