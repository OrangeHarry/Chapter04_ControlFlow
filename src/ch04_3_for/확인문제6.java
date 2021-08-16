package ch04_3_for;

public class 확인문제6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				if (i < j) {
					System.out.print(" "); //이게 print라서 옆으로 쭉가서 빈칸을 만들어 낸것 같다.
				} else {
					System.out.printf("%s" , "*");
				}
			}
			System.out.println();
		}
	}
}
//for중첩문일때 i는 행 j는 열이라고 생각하면 편하다
//