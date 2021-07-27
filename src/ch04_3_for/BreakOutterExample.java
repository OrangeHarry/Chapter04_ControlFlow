package ch04_3_for;

public class BreakOutterExample {
	public static void main(String[] args) {
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " ~ " + lower);
				if (lower == 'g') {
					break Outter; //g를 치는 순간 아예 그냥 싹다 나와버려!!
				}
			}
		}
	System.out.println("프로그램 실행 종료");
	}
}
