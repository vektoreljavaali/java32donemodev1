package com.odev;

import java.util.Scanner;

public class runner {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eh="";
		int kacsayi=0,islem=0;
		double islemsonucu=0;
		boolean durum=true;
		boolean durum1 =true; 
		for(;durum1;) {
		//-----------------------------------------------------------
			
			 for(;durum;) {
			 System.out.println("0- Toplama ��lemi");
			 System.out.println("1- ��kartma ��lemi");
			 System.out.println("2- �arpma ��lemi");
			 System.out.println("3- B�lme ��lemi");
			 System.out.println("Yapmak istedi�iniz i�lemin numaras�n� giriniz..: ");
			 
			 // se�ilen i�lemin rakam�n� al�yoruz.
			 islem= sc.nextInt();
			 
			 // se�ilen i�lemin do�rulu�unu kontrol ediyoruz.
			 if(islem<=-1 || islem>=4) {
				 
				 System.out.println("0 ile 3 aras� i�lem rakam� girmelisiniz.");
				 
			 }
			 else {
				 durum=false;
			 }
			 }
			
			 //-----------------------------------------------
			 
			 System.out.println("ka� say� girmek istiyorsun? ");
			 	 
			 
			 // ka� adet say� ile i�lem yap�laca��n� se�iyor.
			 kacsayi = sc.nextInt();
			 
			 
			 islemler islm = new islemler();
			 
			 // se�ilen i�lem rakam�na g�re ilgili method �a��r�l�r.
			 
			 if(islem==0)islemsonucu=islm.toplam(kacsayi);
			 if(islem==1)islemsonucu=islm.cikartma(kacsayi);
			 if(islem==2)islemsonucu=islm.carpma(kacsayi);
			 if(islem==3)islemsonucu=islm.bolme(kacsayi);
			 
			 System.out.println("Toplam sonu�.....:"+ islemsonucu);	
		
		//------------------------------------------------------------	
		System.out.print("��lem yapmaya devam etmek istiyor musunuz?(E/H)  ");
		eh= sc.next();
		if(eh.equals("E") || eh.equals("e"))
			
			{
			durum1=true;
			durum=true;
			}
			
			else
			durum1=false;
		}
	
		
	}
	
	
}
