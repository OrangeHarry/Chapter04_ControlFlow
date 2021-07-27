package ch04_3_for;

public class 구구단과제2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("[%d단]\t", i);
		}
		System.out.println();//줄내려서 정리용도
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%dX%d=%d\t", j, i, j * i); //사실은 한줄로 가는 결과를 도출하니깐 1X2, 2X1, 3X1...로 쭉만들어서 세로로 보면 오히려 그게 구구단 처럼 보이게 하기(야매)
			}
			System.out.println();
		}

	}
}
