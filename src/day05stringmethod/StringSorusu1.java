package day05stringmethod;

import java.util.Scanner;

public class StringSorusu1 {

	public static void main(String[] args) {
		// !. Girilen Stringi tersten xazan bir kod yaziniz.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütgen kelime giriniz");
		String str = scan.nextLine();
		
		int countStr = str.length();
		while (countStr>0) {
			System.out.print(str.charAt(countStr-1));
			countStr--;
			
		}
	}

}
