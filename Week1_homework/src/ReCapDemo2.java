package WEEK1;

public class ReCapDemo2 {

	public static void main(String[] args) {

		double[] myList= {1.46,486.95,21.18};
		
		double total = 0;
		double max_num=myList[0];
		
		for (double d : myList) {
			if (max_num<d) {
				max_num = d;
				
				
			}
			
			total = total +d;
			
		}
		System.out.println("sayilarin toplami : "+ total);
		System.out.println("En büyük sayi : "+ max_num);


	}

}
