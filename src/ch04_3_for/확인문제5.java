package ch04_3_for;

public class 확인문제5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) { // 크기 비교이기 때문에 j <= i 는 꼭 들어가야한다.(부등호 같은지까지 확인)!!
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
	}
}
