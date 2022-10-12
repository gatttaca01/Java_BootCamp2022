package WEEK1;

public class MiniProject2_kalin_sesli_ince_sesli_harfler {
	
	public static void main(String[] args) {
	
		char vowel = 'ü';
		
		char[] bold_vowels = {'A','I','O','U','a','ı','o','u'};
		
		char[] thin_vowels= {'E','İ','Ü','Ö','e','i','ö','ü'}; 

	 for (char c : thin_vowels) {
		 if (c == vowel) {
			System.out.println("Thin vowel");
		}
		
	}
	 for (char k : bold_vowels) {
		 if (k == vowel) {
				System.out.println("Bold_vowel");
			}
		 
		
	}

	}
	
}
