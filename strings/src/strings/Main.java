package strings;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý : "+mesaj.length());
		System.out.println("5. Eleman : " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn"));
		System.out.println(mesaj.startsWith("t"));
		System.out.println(mesaj.endsWith("l"));
		char[] karakter= new char[5];
		
		
	}

}
