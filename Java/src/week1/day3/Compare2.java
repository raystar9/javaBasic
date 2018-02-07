package week1.day3;

import java.util.Scanner;

public class Compare2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 값을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 == num2) {
			System.out.println("두 값이 일치합니다.");
		}
		
		else {
			System.out.println("두 값이 일치하지 않습니다.");
		}
		
	}
}