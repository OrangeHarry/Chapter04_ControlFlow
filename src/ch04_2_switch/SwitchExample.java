package ch04_2_switch;

public class SwitchExample {
	public static void main(String[] args) {
//		int score = 85;
//		char grade;
//		
//		if (score > 90) {
//			grade = 'A';
//		} else if (score >= 80 && score < 90) {
//			grade = 'B';
//		} else if (score >= 70 && score < 90) {
//			grade = 'C';
//		} else if (score >= 60 && score < 70) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
//		System.out.println("your grade is " + grade); 
//		int score = 92;
//		char grade = 0;

		int month = 3;
		switch (month) {
		case 12: //case�� ������ �ƴ� ��Ȯ�� ���� �־��־�� �Ѵ�.
		case 1://������ �������� �� ������ ���ƿö� ���๮�� �־��ָ� �ȴ�. ������~
		case 2:
			System.out.println("�ܿ�");
			break; //break�� ������ �׳� �ؿ������� �� �����ϴ°ž�
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		}
	}
}
//break�� ��� �ߵ��ư���. ��� �귯�������� �ƴ°� �߿��ϴ�