package com.odev;

import java.util.Scanner;

public class islemler {

	int sonuc=0;
	Scanner sc = new Scanner(System.in);
	
	public double toplam(int sayi) {
		
		for (int i = 0; i < sayi; i++) {
		    	 
			 System.out.println((i+1)+". Sayýyý gir....: ");
			 sonuc += sc.nextInt();			
		    
		}
		
		return sonuc;
	}
	
	
	public double cikartma(int sayi) {
	
		for (int i = 0; i < sayi; i++) {
	    	 
			 System.out.println((i+1)+". Sayýyý gir....: ");
			 sonuc -= sc.nextInt();			
		    
		}
		return sonuc;
	}
	
	public double carpma(int sayi) {
		sonuc=1;
		
		for (int i = 0; i < sayi; i++) {
	    	 
			 System.out.println((i+1)+". Sayýyý gir....: ");
			 sonuc *= sc.nextInt();			
		    
		}
		return sonuc;
	}
		
	public double bolme(int sayi) {
		sonuc=1;
		for (int i = 0; i < sayi; i++) {
	    	 
			 System.out.println((i+1)+". Sayýyý gir....: ");
			 sonuc /= sc.nextInt();			
		    
		}
		return sonuc;
	}
		
	
}
