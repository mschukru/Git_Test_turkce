package day05stringmethod;

import java.util.Scanner;

public class StringSorusu3 {

	public static void main(String[] args) {
		// Kullanicidan alinan String kümesi icerisinde aranan String'i bulan bir kod yaziniz. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String str = scan.nextLine();
		System.out.println("buluncak kelime giriniz");
		String strbul = scan.nextLine();
		
		System.out.println(str.contains(strbul));
		

	}

}
