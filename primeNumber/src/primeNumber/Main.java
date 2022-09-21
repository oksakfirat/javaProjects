package primeNumber;

public class Main {

	public static void main(String[] args) {
		int number=13;
		int counter=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				counter=counter+1;
			}
		}
		if(counter==2) {
			System.out.println(number +" "+ "Bir asal sayıdır ");
		}
		else {
			System.out.println(number +" "+"Bir asal sayı değildir");
		}

	}

}
