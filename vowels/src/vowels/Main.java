package vowels;

public class Main {

	public static void main(String[] args) {
	
		char letter='E';
		
		switch(letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(letter+" "+"Kalýn sesli harf");
			break;
		case 'E':
		case 'Ý':
		case 'Ö':
		case 'Ü':
			System.out.println(letter+" "+"Ýnce sesli harf");
			break;
		default:
			System.out.println(letter+" "+" Bir sesli harf deðildir.");
		}

	}

}
