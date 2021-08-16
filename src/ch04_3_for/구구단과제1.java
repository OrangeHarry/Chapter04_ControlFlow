package ch04_3_for;

public class 구구단과제1 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "단]");

			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "x" + j + " = " + (i * j));
				System.out.printf("%d X %d = %d\t", i, j, i * j);
			}
			System.out.println();
		}
	}
}

//과제 
//2단 --- 
//3단 ---옆으로 행으로 찍히게 작성해보자  
//      각 값의 간격은\t으로 맞추자
//