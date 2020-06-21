package day05stringmethod;

import java.util.Scanner;

public class StringSorusu5 {

	public static void main(String[] args) {
		// Kullaniciningirdigi String degerlerini büyük harfe ceviren  Java kodunu giriniz. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir kelime giriniz");
		String str = scan.nextLine();
		
		System.out.println(str.toUpperCase());

	}

}
