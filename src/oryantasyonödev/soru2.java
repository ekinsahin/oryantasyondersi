package oryantasyonödev;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		//  not programı
		
		Scanner kullanici= new Scanner (System.in);
		System.out.println("Bir not giriniz:");
		char grade= kullanici.next().charAt(0);
		
		
		switch (grade) {
		case'A' :
			System.out.println("Tebrikler,gectiniz");
		  break;
		case'B' :
			System.out.println("Tebrikler,gectiniz");
		  break;
		case'C' :
			System.out.println("Tebrikler,gectiniz");
		  break;
		case'D' :
		    System.out.println("Tebrikler,gectiniz");
		  break;
		case'E' :
			System.out.println("Tebrikler,gectiniz");
		  break;
		case'F' :
			System.out.println("Maalesef,gecemediniz");
		  break;
	    default:
			 System.out.println("Gecersiz bir not girdiniz");
		
		
		
		}
		
		
		
		
		

	}

}
