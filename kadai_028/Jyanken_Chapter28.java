package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

//じゃんけんの処理を書く「設計図」

public class Jyanken_Chapter28 {

	/**
	 * 自分のじゃんけんの手を入力するメソッド
	 * @return 入力したじゃんけんの手
	 */
	public String getMyChoice() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner scanner = new Scanner(System.in); // キーボードから入力を受け取るScannerを作る　受け取る準備
		String myChoice = scanner.nextLine(); // 入力された文字をmyChoiceに入れる 受け取る

		while (!myChoice.equals("r")
				&& !myChoice.equals("s")
				&& !myChoice.equals("p")) {

			System.out.println("r、s、pのいずれかを入力してください");
			myChoice = scanner.nextLine(); // 正しい入力になるまで再入力
		}

		return myChoice; // 入力されたじゃんけんの手を返す
	}

	/**
	 * 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	 * @return 対戦相手のじゃんけんの手
	 */
	public String getRandom() {

		String[] hands = { "r", "s", "p" };

		int random = (int) Math.floor(Math.random() * 3);

		return hands[random];
	}

	/**
	 * じゃんけんを実行し、結果を表示するメソッド
	 */
	public void playGame() {

		String myChoice = getMyChoice(); //自分の手を入れる箱
		String enemyChoice = getRandom(); //相手の手を入れる箱

		HashMap<String, String> handMap = new HashMap<>();

		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");

		System.out.println("自分の手は" + handMap.get(myChoice) + "、対戦相手の手は" + handMap.get(enemyChoice));

		if ((myChoice.equals("r") && enemyChoice.equals("s"))
				|| (myChoice.equals("s") && enemyChoice.equals("p"))
				|| (myChoice.equals("p") && enemyChoice.equals("r"))) {

			System.out.println("自分の勝ちです");

		} else if (myChoice.equals(enemyChoice)) {

			System.out.println("あいこです");

		} else {

			System.out.println("自分の負けです");

		}
	}
}
