package week1.day3;

import java.util.Scanner;

public class Test {

	public static void main(String args[]) {
		
		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		System.out.println(a > b? (a > c? a : b) : (b > c? b : c));
	}
}
