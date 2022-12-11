package oryantasyonödev;

import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		//hipotenüs hesaplayan program
		
		int kenar1= 0;
		Scanner giris= new Scanner (System.in);
		System.out.println("Lutfen ucgenin dik kenarlarindan birincisini giriniz ");
		kenar1= giris.nextInt();
		
		int kenar2= 0;
		System.out.println("Lutfen ucgenin dik kenarlarindan ikincisini giriniz");
		kenar2= giris.nextInt();
		
		double hipotenus= Math.sqrt((kenar2*kenar2)+(kenar1*kenar1));
		System.out.println("Ucgeninizin hipotenusu: " + hipotenus)	;
		
		
		
		
		
		
		

	}

}
