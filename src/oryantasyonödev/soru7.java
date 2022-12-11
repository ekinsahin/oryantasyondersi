package oryantasyonödev;

import java.util.Scanner;

public class soru7 {

	public static void main(String[] args) {
		//odanın alanını hesaplayan program
		
		double kenar1= 0;
		Scanner scanner= new Scanner (System.in);
		System.out.println("Lutfen odanizin bir kenarinin metre cinsinden degerini girin");
		kenar1= scanner.nextDouble();
		
		double kenar2= 0;
		System.out.println("Lutfen odanizin diger kenarinin metre cinsinden degerini girin");
		kenar2= scanner.nextDouble();
		
		double alan= kenar1*kenar2;
		System.out.println("Odanizin alani: " + alan + " metrekaredir");
		
		
		
		
		

	}

}
