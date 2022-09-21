package multiDimensionalArray;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler= new String[3][3];
		
		sehirler[0][0]="Ýstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Anakara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbakýr";
		sehirler[2][1]="Þanlýurfa";
		sehirler[2][2]="Gaziantep";
		
		for(int i=0;i<sehirler.length;i++) {
			for(int j=0;j<sehirler.length;j++) {
				if(i==0 && j==0) {
					 System.out.println("---Marmara illeri---");
				}
				if(i==0) {
					System.out.println(sehirler[i][j]);
					
				}
				if(i==1 && j==0) {
					System.out.println("---Ýç Anadolu illeri---");
				}
				if(i==1) {
					System.out.println(sehirler[i][j]);
					}
				if(i==2 && j==0) {
					System.out.println("---Güneydoðu illeri---");
				}
				if(i==2) {
					System.out.println(sehirler[i][j]);
					}
				
			}
		}
		

	}

}
