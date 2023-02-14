import java.util.Scanner;

public class cinZodyagProgrami {

	public static void main(String[] args) {
		
		System.out.println("Çin Zodyağınızı görmek ister misiniz?");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		
		if (answer.equals("evet")) {
			System.out.println("Öyleyse başlayalım. Heyecanlı mısın? ");
			String yanit = input.nextLine();
			
			System.out.print("Doğum yılınızı 4 basamaklı olacak şekilde giriniz:");
			int year = input.nextInt();
			int kalanyil = year % 12 ;
			
			switch (kalanyil) {
			case 1 :
				System.out.print("Çin Zodyağı Burcunuz: Horoz.");
			break;
			
			case 2 :
				System.out.print("Çin Zodyağı Burcunuz: Köpek.");
			break;
				
			case 3 :
				System.out.print("Çin Zodyağı Burcunuz: Domuz.");
			break;
			
			case 4 :
				System.out.print("Çin Zodyağı Burcunuz: Fare.");
				break;
				
			case 5 :
				System.out.print("Çin Zodyağı Burcunuz: Öküz.");
				break;
				
			case 6 :
				System.out.print("Çin Zodyağı Burcunuz: Kaplan.");
				break;
				
			case 7 :
				System.out.print("Çin Zodyağı Burcunuz: Tavşan.");
				break;
				
			case 8 :
				System.out.print("Çin Zodyağı Burcunuz: Ejderha.");
				break;
				
			case 9 :
				System.out.print("Çin Zodyağı Burcunuz: Yılan.");
				break;
				
			case 10 :
				System.out.print("Çin Zodyağı Burcunuz: At.");
				break;
				
			case 11 :
				System.out.print("Çin Zodyağı Burcunuz: Koyun.");
				break;
				
				default :
					System.out.print("Çin Zodyağı Burcunuz: Maymun");
					
			}
			
			
			
			
			
			
			
			
			
		}
		

	}

}
