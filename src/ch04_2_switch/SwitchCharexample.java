package ch04_2_switch;

public class SwitchCharexample {
	public static void main(String[] args) {
		char grade = 'b';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ� �Դϴ�.");
//			������ �������̶� ���� break;�� �ۼ��� �ʿ䰡 ����
		}
	}
}
