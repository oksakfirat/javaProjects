package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("M�kemmel ge�tiniz.");
			break;
		case 'B':
			System.out.println("�ok g�zel ge�tiniz.");
			break;
		case 'C':
			System.out.println("iyi ge�tiniz.");
			break;
		case 'D':
			System.out.println("fena de�il ge�tiniz.");
			break;
		case 'F':
			System.out.println("Malesef kald�n�z.");
			break;
		default:
		    System.out.println("Ge�ersiz not girdiniz.");
			
		
		}
		
	}

}
