package ch04_3_for;

import java.util.Scanner;

public class Ȯ�ι���7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // ����...���̾�??
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------------");
			System.out.print("����> ");

			int inputData = Integer.parseInt(scanner.nextLine());

			if (inputData == 1) {
				System.out.print("���ݾ�> ");
//				balance = Integer.parseInt(scanner.nextLine());
				balance = balance + Integer.parseInt(scanner.nextLine());
			} else if (inputData == 2) {
				System.out.print("��ݾ�> ");
				balance = balance - Integer.parseInt(scanner.nextLine());
			} else if (inputData == 3) {
				System.out.println("�ܰ�> ");
				System.out.println(balance);
			} else if (inputData == 4) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
