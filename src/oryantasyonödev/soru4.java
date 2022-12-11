package oryantasyonödev;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		// ehliyet yaş
		
		int yas= 0;
		Scanner kullanici= new Scanner (System.in);
		System.out.println("Lutfen yasinizi giriniz");
		yas= kullanici.nextInt(); 
		
		if (yas>=18) {
		 System.out.println("Ehliyet alabilirsiniz");
		}else {
		 System.out.println("Maalesef, ehliyet alamazsiniz");
		}
		
		

	}

}
