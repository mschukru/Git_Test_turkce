package day05stringmethod;

import java.util.Scanner;

public class StringSorusu6 {

	public static void main(String[] args) {
		// Girilecek kelimenin Palindrom olup olmadigini dogrulayacak bir Java kodu yaziniz.
		//Palindrom: kelimenin/rakamin düzden ve tersten yazilisinin ayni oldugu durumlara denir. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String str = scan.nextLine();
		
		String tersStr = "";
		int count = str.length()-1;
		for(;count>=0;count--) {
			tersStr = tersStr + str.charAt(count);
			
		}
		if(tersStr.equals(str)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

}
