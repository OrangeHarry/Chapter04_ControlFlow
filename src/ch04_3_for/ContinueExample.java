package ch04_3_for;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 홀수
				continue; // 반사한다는 의미ㅋㅋㅋ 홀수일때는 찍지말고 계속해(continue) 다시 조건식으로 돌아가
			}
			System.out.println(i);
		}
	}
}
//continue는 필터가 필요할때 사용하면 참 좋다.