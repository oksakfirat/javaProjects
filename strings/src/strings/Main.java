package strings;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s� : "+mesaj.length());
		System.out.println("5. Eleman : " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n"));
		System.out.println(mesaj.startsWith("t"));
		System.out.println(mesaj.endsWith("l"));
		char[] karakter= new char[5];
		
		
	}

}
