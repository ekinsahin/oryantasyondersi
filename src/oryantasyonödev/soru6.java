package oryantasyonödev;

import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {
		// vki hesaplayan uygulama
		 Scanner scanner= new Scanner (System.in);
		 System.out.println("Lutfen kilonuzu girin");
		 double kilo= scanner.nextDouble();
		 
		 System.out.println("Lutfen boyunuzu giriniz");
		 double boy= scanner.nextDouble();
		  
		 double vki= kilo/(boy*boy);
		  System.out.println("Vucut kitle endeksiniz: " + vki );
		  

	}

}
