package deneme;

import java.util.Scanner;

public class yourLuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu =  new Scanner(System.in);
		System.out.println("Isminiz nedir?");
		String isim =okuyucu.next();
		System.out.println("Merhaba, "+ isim);
		System.out.println("Yasiniz kac?");
		int yas = okuyucu.nextInt();
		System.out.println("Şanslı sayınız: ");
		
	    int harfSayisi = isim.length()	;
		int sansliSayi = 0;
		
	     if(yas<15) {
	    	 sansliSayi = (harfSayisi * harfSayisi)%10 ;
	    	 
	     }else if(yas<20){	         
	    	 sansliSayi = (yas * harfSayisi - yas)%10 ;
	    			 
	     }else if(yas<40) {	    	 
	    	 sansliSayi = (harfSayisi + yas)%10 ;
	    	 
	     }else if(yas<60) {
	    	 sansliSayi = (yas * yas)%10 ;
	    	 
	     }else {
	    	 sansliSayi = (harfSayisi + harfSayisi - yas)%10 ;
	     }
	     
	     if(sansliSayi<0) {
	    	sansliSayi= (sansliSayi * -1) ;
	     }
	     
	     System.out.println( sansliSayi);
	     
		
		
		

	
	}
}
