package ch04_3_for;

public class 구구단과제2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.print("[" + i + "단]\t"); //아예 하나를 따로 만들어서 빼자
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 9; j++) { // i가 1이고 j가 바뀌면서 출력되면 1x2, 2X1이 가로로 출력되니깐 구구단이 나오는것처럼 보인다(약간 야매로 만드는 느낌이네)
				System.out.printf("%dX%d=%d\t", j, i, j * i);
			}
			System.out.println(); // 얘가 있어야 밑으로 착착 내려가지
		}
	}
}
