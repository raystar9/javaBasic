package week1.day4.exam;

public class Exam6 {

	public static void main(String[] args) {
		
		int startDate = 4;
		int date = 0;
		
		System.out.println("=====================================================");
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 7; i++) {
				if(j == 0 && startDate > i) {
					System.out.print("\t");
					continue;
				}
				date = j * 7 + (i - startDate + 1);
				if(date > 28)
					break;
				System.out.print(date + "\t");
			}
			System.out.println();
		}
	}
}
