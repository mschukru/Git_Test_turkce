package day05stringmethod;

import java.util.Scanner;

public class StringSorusu2 {

	public static void main(String[] args) {
		// 2 farkli String'i ucuca ekleyen java kodunu yaziniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("LÜtfen 1. kelimeyi giriniz");
		String str1 = scan.nextLine();
		System.out.println("LÜtfen 2. kelimeyi giriniz");
		String str2 = scan.nextLine();
		
		System.out.println(str1.concat(str2));
	}

}
