package ch04_1_If;

public class IfExample {
	public static void main(String[] args) {
		int score = 88;
		char grade;
		if (score > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}//���� 2���� ����϶��� �̷��� ����
		System.out.println("your grade is " + grade);
//		char grade = (score > 90) ? 'A' : 'B'; ���׿����ڶ� �������̳�
	}
}
