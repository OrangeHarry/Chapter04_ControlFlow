package ch04_3_for;

public class 구구단과제 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "단]");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
//for(int i = 0; i < 100; i++) { 이게 for의 기본 폼이니깐 왠만하면 바꾸지말고 사용하자!!!!(int i=0;부터 시작!!)
//	
//}