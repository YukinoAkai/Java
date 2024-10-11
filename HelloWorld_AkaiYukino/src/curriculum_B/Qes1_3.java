package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/**************************************************
		* Q1.ログイン時の入力チェックシステムを下記条件で作成してください
		* ・コンソールにユーザー名を入力できるようにしてください
		* ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		* ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		* ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		* Q2.ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		***************************************************/

		System.out.println("Q1");
		Scanner scanner = new Scanner(System.in);
		// 入力された物を入れる変数
		String userName;

		while (true) {
			System.out.println("ユーザー名を入力");
			// 入力欄
			userName = scanner.nextLine();

			if (userName.length() > 10) {
				// 文字数が10文字より大きい場合
				System.out.println("名前を10文字以内にしてください");
			} else if (userName.length() == 0 || userName == null) {
				// 文字数が0文字以下もしくはnullの場合
				System.out.println("名前を入力してください");
			} else if (!userName.matches("^[A-Za-z0-9]+$")) {
				// Q2.半角英数字以外の場合
				System.out.println("半角英数字のみで名前を入力してください");
			} else {
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				// 正常な値だった場合
				// 登録できたらループ止める
				break;

			} // if
		} // While

		// Scannerをクローズ
		scanner.close();

		/**************************************************
		 *じゃんけんのシステムを下記の条件で作成してください
		 *・「0はグー、1：チョキ、2：パー」とすること
		 *・じゃんけんに勝つまでループすること
		 *・一回ごとに自分の手と相手の手を下記の通り出力してください
		 ********
		 **** ユーザー名「name」を登録しました
		 **** nameの手は「パー」
		 **** 相手の手は「グー」
		 ********
		 *
		 *・条件分岐の設定
		 *・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
		 **** やるやん。
		 **** 次は俺にリベンジさせて
		 *
		 *・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
		 **** 俺の勝ち！
		 **** 負けは次につながるチャンスです！
		 **** ネバーギブアップ！
		 *
		 *・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
		 **** 俺の勝ち！
		 **** たかがじゃんけん、そう思ってないですか？
		 **** それやったら次も、俺が勝ちますよ
		 *
		 *・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
		 **** 俺の勝ち！
		 **** なんで負けたか、明日まで考えといてください。
		 **** そしたら何かが見えてくるはずです
		 *
		 *・あいこの場合、下記が出力されるようにしてください
		 **** DRAW あいこ もう一回しましょう！
		 *
		 *じゃんけんを行った回数を表示してください
		 ****************************************************/

		//System.out.println("Q3");
		Random random = new Random();
		// 乱数を入れる変数
		int userHand;
		int enemyHand;
		// 回数を入れる変数
		int count = 0;
		// じゃんけんの配列
		String[] jankens = { "グー", "チョキ", "パー" };

		while (true) {
			// 0~2の乱数
			userHand = random.nextInt(2);
			enemyHand = random.nextInt(2);
			count++;

			System.out.println(userName + "の手は「" + jankens[userHand]+"」");
			System.out.println("相手の手は「" + jankens[enemyHand]+"」");
			System.out.println(""); // スペース

			// 判定
			if ((userHand == 0 && enemyHand == 1) || (userHand == 1 && enemyHand == 2)
					|| (userHand == 2 && enemyHand == 0)) {
				// 自分がじゃんけんに勝った場合
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println(""); // スペース
				break;
			} else if (userHand == 0 && enemyHand == 2) {
				// 自分がじゃんけんでグーに負けた場合
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				System.out.println(""); // スペース
			} else if (userHand == 1 && enemyHand == 0) {
				//自分がじゃんけんでチョキに負けた場合
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				System.out.println(""); // スペース
			} else if (userHand == 2 && enemyHand == 1) {
				//自分がじゃんけんでパーに負けた場合
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				System.out.println(""); // スペース
			} else {
				// あいこの場合、下記が出力されるようにしてください
				System.out.println("DRAW あいこ もう一回しましょう！");
				System.out.println(""); // スペース
			}
		} // while
		System.out.println("勝つまでにかかった回数は" + count + "です。");
	}
}
