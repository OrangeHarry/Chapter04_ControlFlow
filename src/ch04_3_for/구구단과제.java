package ch04_3_for;

public class �����ܰ��� {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "��]");
			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "x" + j + " = " + (i * j));
				System.out.printf("%d X %d = %d\n", i, j, i * j);

			}
		}
	}
}

//���� 
//2�� --- 
//3�� ---������ ������ ������ �ۼ��غ���  
//      �� ���� ������\t���� ������
