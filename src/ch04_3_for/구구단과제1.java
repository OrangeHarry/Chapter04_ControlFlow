package ch04_3_for;

public class �����ܰ���1 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "��]");

			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "x" + j + " = " + (i * j));
				System.out.printf("%d X %d = %d\t", i, j, i * j);
			}
			System.out.println();
		}
	}
}

//���� 
//2�� --- 
//3�� ---������ ������ ������ �ۼ��غ���  
//      �� ���� ������\t���� ������
//