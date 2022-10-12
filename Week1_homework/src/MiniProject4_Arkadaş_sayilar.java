package WEEK1;

public class MiniProject4_Arkadaş_sayilar {

	public static void main(String[] args) {
		int count1 = 80;
		int count2 = 45;
		int total1 = 0;
		int total2 = 0;
		
		for (int i = 1; i < count1; i++) {
			if (count1 % i == 0) {
				total1+=i;
			}
		}

		for (int i = 1; i < count2; i++) {
			if (count2 % i == 0) {
				total2+=i;
			}
		}
		
		if (count1 == total2 && count2 == total1) {
			System.out.println("These are friends numbers"); 
		}else {
			System.out.println("These are not friends number ");
		}
		

	}

}
