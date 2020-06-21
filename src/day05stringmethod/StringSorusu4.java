package day05stringmethod;

import java.util.Scanner;

public class StringSorusu4 {

	public static void main(String[] args) {
		// Kullanicidan alinan Stringin son character'ini silip ekrana yazdiran bir kod giriniz. 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		
		String str = scan.nextLine();
		System.out.println(str.substring(0, str.length()-1));

	}

}
