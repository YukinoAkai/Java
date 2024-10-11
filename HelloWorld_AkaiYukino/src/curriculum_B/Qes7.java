package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		/************
		 * Q6.N人の生徒の成績を管理するプログラムを下記条件で作成してください
		 * ・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
		 * ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
		 * ・このプログラムの実行は必ず1回以上行われるようにしてください
		 * ・出力例を参考にプログラミングを作成してください
		 * ***  生徒の人数を入力してください（2以上）: 2
		 * 		1人目の『英語』の点数を入力してください :10
		 * 		1人目の『数学』の点数を入力してください :10
		 * 					：
		 * 		2人目の『英語』の点数を入力してください :10
		 * 		2人目の『数学』の点数を入力してください :10
		 * 					：
		 * 		1人目の平均点は10.00点です。
		 * 		2人目の平均点は10.00点です。
		 * 					：
		 * 		英語の平均点は10.00点です。
		 * 		数学の平均点は10.00点です。
		 * 		全体の平均点は10.00点です。
		 *************/

		// 入力オブジェクト
		Scanner scanner = new Scanner(System.in);
		// 生徒の人数
		int students;
		// 生徒の成績
		double[][] studentPerformans;
		// 各教科合計
		double englishTotal = 0; //英語
		double mathTotal = 0; //数学
		double scienceTotal = 0; //理科
		double socialTotal = 0; //社会
		// 各生徒の合計
		double[] studentsTotal;
		// 各生徒の科目平均点
		double kakuStuAve = 0;
		// 全体の科目平均点
		double totalAve = 0;

		// 入力
		System.out.print("生徒の人数を入力してください");
		students = scanner.nextInt();
		System.out.println(" "); // 改行
		// []に人数[]科目数が入った配列
		studentPerformans = new double[students][4];
		// 全教科の合計する配列設置
		studentsTotal = new double[students];

		// for文で成績を入れていく
		for (int i = 0; i < students; i++) {
			// [i][0]番目に英語の点数
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください:");
			studentPerformans[i][0] = scanner.nextInt();
			// i番目の英語合計へ点数をたす
			englishTotal += studentPerformans[i][0];
			// i番目の全教科の合計へ点数をたす
			studentsTotal[i] += studentPerformans[i][0];

			// [i][1]番目に数学
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください:");
			studentPerformans[i][1] = scanner.nextInt();
			//i番目の英語合計へ点数をたす
			mathTotal += studentPerformans[i][1];
			// i番目の各教科の合計へ点数をたす
			studentsTotal[i] += studentPerformans[i][1];

			// [i][2]番目に理科
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください:");
			studentPerformans[i][2] = scanner.nextInt();
			//i番目の理科合計へ点数をたす
			scienceTotal += studentPerformans[i][2];
			// i番目の各教科の合計へ点数をたす
			studentsTotal[i] += studentPerformans[i][2];

			// [i][3]番目に社会
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください:");
			studentPerformans[i][3] = scanner.nextInt();
			//i番目の英語合計へ点数をたす
			socialTotal += studentPerformans[i][3];
			// i番目の各教科の合計へ点数をたす
			studentsTotal[i] += studentPerformans[i][3];

			System.out.println(" "); // 改行

		} //for

		// 各生徒の全教科の平均点
		for (int i = 0; i < students; i++) {
			kakuStuAve = studentsTotal[i] / 4;
			System.out.println((i + 1) + "人目の平均点は" + kakuStuAve + "点です。");

		} //for

		System.out.println(" "); // 改行

		// 各教科の平均点
		System.out.println("英語の平均点は" + englishTotal / students + "点です。");
		System.out.println("数学の平均点は" + mathTotal / students + "点です。");
		System.out.println("理科の平均点は" + scienceTotal / students + "点です。");
		System.out.println("社会の平均点は" + socialTotal / students + "点です。");

		System.out.println(" "); // 改行

		// 全体の平均点
		totalAve = (englishTotal + mathTotal + scienceTotal + socialTotal) / (students * 4);
		System.out.println("全体の平均点は" + totalAve + "点です。");

		// Scannerをクローズ
		scanner.close();
	}

}
