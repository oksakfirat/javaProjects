package arrays;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="f�rat";
		String ogrenci2="Engin";
		String ogrenci3="ok�ak";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("A�a�dakiler Dizi ile Yap�lm��t�r");
		String[] ogrenciler= new String[3];
		ogrenciler[0]="f�rat";
		ogrenciler[1]="Engin";
		ogrenciler[2]="Ok�ak";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("----------------------");
		for(String ogrenci:ogrenciler) {
		System.out.println(ogrenci);
		}

	}

}
