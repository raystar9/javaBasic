package week1.day4.exam;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		
		String city = "";
		Scanner sc = new Scanner(System.in);
		
		while(!city.equals("q")) {
			System.out.print("지역을 입력해주세요 : ");
			city = sc.nextLine();
			switch(city) {
			case "서울" :
				System.out.println("서울입니다.");
				break;
			case "대전" :
				System.out.println("대전입니다.");
				break;
			case "대구" :
				System.out.println("대구입니다.");
				break;
			case "부산" :
				System.out.println("부산입니다.");
				break;
			case "제주도" :
				System.out.println("제주도입니다.");
				break;
			case "q" :
				break;
			default :
				System.out.println("그 외 지역입니다.");
			}
		}
		sc.close();
		System.out.println("종료합니다.");
	}
}
