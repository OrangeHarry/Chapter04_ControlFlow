package ch04_1_If;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
			System.out.printf("%d번이 나왔습니다.\n", num);
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
			System.out.printf("%d번이 나왔습니다.\n", num);
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
			System.out.printf("%d번이 나왔습니다.\n", num);
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
			System.out.printf("%d번이 나왔습니다.\n", num);
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
			System.out.printf("%d번이 나왔습니다.\n", num);
		} else {
			System.out.println("6번이 나왔습니다.");
			System.out.printf("%d번이 나왔습니다.\n", num);
		}

//		System.out.println((int) (Math.random() * 6 + 1)); 
//		System.out.println((int) (Math.random() * 6 + 1));
//		System.out.println((int) (Math.random() * 6 + 1));
//		System.out.println((int) (Math.random() * 6 + 1));
//		System.out.println((int) (Math.random() * 6 + 1));
//		System.out.println((int) (Math.random() * 6 + 1));
	}
}
// 곱하기가 딱 그 수를 곱한게 아니라 그 숫자까지 나오게 하는거라고 생각을하자
// *10을 해서 숫자가 나온게 아니라 10까지의 결과를 도출해 내려고 *10을 한다고 생각하자(경우의 수라 생각)
// +는 +한값만큼 옮겨진다고 생각하면 된다(shift) ex)+2는 2부터 시작
