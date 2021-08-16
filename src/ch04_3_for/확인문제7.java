package ch04_3_for;

import java.util.Scanner;

public class 확인문제7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 균형...돈이야??
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");

			int inputData = Integer.parseInt(scanner.nextLine());

			if (inputData == 1) {
				System.out.print("예금액> ");
//				balance = Integer.parseInt(scanner.nextLine());
				balance = balance + Integer.parseInt(scanner.nextLine());
			} else if (inputData == 2) {
				System.out.print("출금액> ");
				balance = balance - Integer.parseInt(scanner.nextLine());
			} else if (inputData == 3) {
				System.out.println("잔고> ");
				System.out.println(balance);
			} else if (inputData == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
