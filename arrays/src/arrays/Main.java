package arrays;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="fýrat";
		String ogrenci2="Engin";
		String ogrenci3="okþak";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("Aþaðdakiler Dizi ile Yapýlmýþtýr");
		String[] ogrenciler= new String[3];
		ogrenciler[0]="fýrat";
		ogrenciler[1]="Engin";
		ogrenciler[2]="Okþak";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("----------------------");
		for(String ogrenci:ogrenciler) {
		System.out.println(ogrenci);
		}

	}

}
