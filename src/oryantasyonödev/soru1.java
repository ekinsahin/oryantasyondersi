package oryantasyonödev;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		// Dört sayının ortalmasını bulan program
		
		int sayi1= 0;
		Scanner giris1= new Scanner (System.in);
		System.out.println("ilk sayiyi giriniz");
		sayi1= giris1.nextInt();
		
		int sayi2= 0;
		Scanner giris2= new Scanner (System.in);
		System.out.println("ikinci sayiyi giriniz");
		sayi2= giris2.nextInt();
		
		int sayi3 = 0;
		Scanner giris3= new Scanner (System.in);
		System.out.println("ucuncu sayiyi giriniz");
		sayi3= giris3.nextInt();
		
		int sayi4= 0;
		Scanner giris4= new Scanner (System.in);
		System.out.println("dorduncu sayiyi giriniz");
		sayi4= giris4.nextInt();
		
	    
		int ortalama= 0;
		ortalama=(sayi1+sayi2+sayi3+sayi4)/4;
		
		System.out.println("Sayilarin ortalamasi: " + ortalama);
		
		
		

	}

}
