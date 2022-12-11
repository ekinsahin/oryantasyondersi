package oryantasyonödev;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {
		// sayinin tek mi çift mi olduğunu yazdıran uygulama
		
		int sayi= 0;
		Scanner girilen= new Scanner (System.in);
		System.out.println("Sayi giriniz");
		sayi= girilen.nextInt();
		  
		
		if (sayi%2==0) {
		 System.out.println("Sectiginiz sayi cift sayidir");
		}else {
		 System.out.println("Sectiginiz sayi tek sayidir");
		 
			
		 
		}
		
		
		
		

	}

}
