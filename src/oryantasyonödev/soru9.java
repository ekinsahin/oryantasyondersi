package oryantasyonödev;

import java.util.Scanner;

public class soru9 {

	public static void main(String[] args) {
		// Dairenin çevresini hesaplayan program
		
		
		 int PI= 3;
		 int yaricap= 0;
		 Scanner deger= new Scanner (System.in);
		 System.out.println("Dairenin yaricapini giriniz");
		 yaricap= deger.nextInt();
		  
		 int cevre= 2*(PI)*(yaricap);
		 System.out.println("Daierenin cevresi: " + cevre );
		 
		 

	}

}
