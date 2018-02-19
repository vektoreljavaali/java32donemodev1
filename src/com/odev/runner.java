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
			 System.out.println("0- Toplama Ýþlemi");
			 System.out.println("1- Çýkartma Ýþlemi");
			 System.out.println("2- Çarpma Ýþlemi");
			 System.out.println("3- Bölme Ýþlemi");
			 System.out.println("Yapmak istediðiniz iþlemin numarasýný giriniz..: ");
			 
			 // seçilen iþlemin rakamýný alýyoruz.
			 islem= sc.nextInt();
			 
			 // seçilen iþlemin doðruluðunu kontrol ediyoruz.
			 if(islem<=-1 || islem>=4) {
				 
				 System.out.println("0 ile 3 arasý iþlem rakamý girmelisiniz.");
				 
			 }
			 else {
				 durum=false;
			 }
			 }
			
			 //-----------------------------------------------
			 
			 System.out.println("kaç sayý girmek istiyorsun? ");
			 	 
			 
			 // kaç adet sayý ile iþlem yapýlacaðýný seçiyor.
			 kacsayi = sc.nextInt();
			 
			 
			 islemler islm = new islemler();
			 
			 // seçilen iþlem rakamýna göre ilgili method çaðýrýlýr.
			 
			 if(islem==0)islemsonucu=islm.toplam(kacsayi);
			 if(islem==1)islemsonucu=islm.cikartma(kacsayi);
			 if(islem==2)islemsonucu=islm.carpma(kacsayi);
			 if(islem==3)islemsonucu=islm.bolme(kacsayi);
			 
			 System.out.println("Toplam sonuç.....:"+ islemsonucu);	
		
		//------------------------------------------------------------	
		System.out.print("Ýþlem yapmaya devam etmek istiyor musunuz?(E/H)  ");
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
