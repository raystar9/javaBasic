package week1.day4.exam;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		
		int number1 = 0, number2 = 0;
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		number1 = sc.nextInt();
		System.out.print("�� ��° �� : ");
		number2 = sc.nextInt();
		
		sc.close();
		if(number1 < number2) {
			for(; number1<=number2; number1++) {
				answer += number1;
			}
		} else {
			for(; number2<=number1; number2++) {
				answer += number2;
			}
		}
		System.out.println(answer);
	}
}
