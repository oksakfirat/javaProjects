package vowels;

public class Main {

	public static void main(String[] args) {
	
		char letter='E';
		
		switch(letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(letter+" "+"Kal�n sesli harf");
			break;
		case 'E':
		case '�':
		case '�':
		case '�':
			System.out.println(letter+" "+"�nce sesli harf");
			break;
		default:
			System.out.println(letter+" "+" Bir sesli harf de�ildir.");
		}

	}

}
