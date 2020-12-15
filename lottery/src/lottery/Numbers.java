package lottery;

import java.util.Random;

public class Numbers {

	static int[] numbers3() {//ランダムな数字を3つ作るクラス
		int numbers3[] = new int[3];
		Random rand = new Random();

		for (int i = 0; i < 3; i++) {
			numbers3[i] = rand.nextInt(10);
		}
		return numbers3;
	}

	static int[] numbers4() {//ランダムな数字を4つ作るクラス
		int numbers4[] = new int[4];
		Random rand = new Random();

		for (int i = 0; i < 4; i++) {
			numbers4[i] = rand.nextInt(10);
		}
		return numbers4;
	}

	static void showResult(int[] number) {
		System.out.println("作成した数字は");
		for (int i = 0; i < number.length; i++) {
			System.out.print("[" + number[i] + "]");
		}
		System.out.println("");

		//結果を出力するクラス
	}

}
