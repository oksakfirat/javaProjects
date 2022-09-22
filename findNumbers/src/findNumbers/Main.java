package findNumbers;

public class Main {

	public static void main(String[] args) {
		int[] numbers= new int[]{2,20,8,24,89,4};
		int number=4;
		boolean found=false;
		for(int i=0;i<numbers.length;i++) {
			if(number==numbers[i]) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Sayı bulundu...");
		}
		else {
			System.out.println("Sayı bulunamadı...");
		}
		
	}

}
