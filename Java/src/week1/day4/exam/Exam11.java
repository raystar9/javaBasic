package week1.day4.exam;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		
		String city = "";
		Scanner sc = new Scanner(System.in);
		
		while(!city.equals("q")) {
			System.out.print("������ �Է����ּ��� : ");
			city = sc.nextLine();
			switch(city) {
			case "����" :
				System.out.println("�����Դϴ�.");
				break;
			case "����" :
				System.out.println("�����Դϴ�.");
				break;
			case "�뱸" :
				System.out.println("�뱸�Դϴ�.");
				break;
			case "�λ�" :
				System.out.println("�λ��Դϴ�.");
				break;
			case "���ֵ�" :
				System.out.println("���ֵ��Դϴ�.");
				break;
			case "q" :
				break;
			default :
				System.out.println("�� �� �����Դϴ�.");
			}
		}
		sc.close();
		System.out.println("�����մϴ�.");
	}
}
