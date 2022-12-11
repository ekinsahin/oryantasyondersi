package oryantasyonödev;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// iki sayıyıyı büyükten küçüğe yazdıran uygulama
		
		int sayi1= 0;
		Scanner giris1= new Scanner (System.in);
		System.out.println("Lutfen ilk sayiyiyi giriniz");
		sayi1= giris1.nextInt();
		
		int sayi2= 0;
		Scanner giris2=new Scanner (System.in);
		System.out.println("Lutfen ikici sayiyi giriniz");
		sayi2= giris2.nextInt();
		
		if (sayi1>sayi2) {
		System.out.println( sayi1 +"buyukturr");
		} else {
	    System.out.println( sayi2 + "buyuktur" );
	
		}
			 
	
			
		  
		
		
		
		
		
		
		

	}

}
