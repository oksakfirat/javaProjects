package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz.");
			break;
		case 'B':
			System.out.println("çok güzel geçtiniz.");
			break;
		case 'C':
			System.out.println("iyi geçtiniz.");
			break;
		case 'D':
			System.out.println("fena deðil geçtiniz.");
			break;
		case 'F':
			System.out.println("Malesef kaldýnýz.");
			break;
		default:
		    System.out.println("Geçersiz not girdiniz.");
			
		
		}
		
	}

}
