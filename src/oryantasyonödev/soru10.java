package oryantasyonödev;

import java.util.Scanner;

public class soru10 {

	public static void main(String[] args) {
		// üçgenin alanını hesaplayan program
	
		int kenar1=0;
		Scanner giris= new Scanner (System.in);
		System.out.println("Lutfen ucgenin birinci kenar uzunlugunu giriniz");
		kenar1=giris.nextInt();

		int kenar2=0;
		System.out.println("Lutfen ucgenin ikinci kenar uzunlugunu giriniz");
		kenar2=giris.nextInt();
		
		int alan= (kenar1*kenar2)/2;
		System.out.println("Ucgenin alani: " + alan);
		
		
		
		
		
		
		
		

	}

}
