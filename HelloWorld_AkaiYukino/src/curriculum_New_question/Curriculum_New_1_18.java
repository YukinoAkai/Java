package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void helliJava(String message, int num) {
		System.out.println("Hello " + message + " " + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void keisan(int x, int y) {
		// xとyを受け取って乗算、計算結果をansに代入
		int ans = x * y;
		// ansを表示
		System.out.println(ans);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void hairetu(int[] numbers) {
		// 整数の配列を受け取る、for文で順番に表示
		for (int number : numbers) {
			// 配列の中身を表示
			System.out.println(number);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void keisan(double x, double y) {
		// doubleで受け取り、計算しansに代入
		double ans = x + y;
		// 結果を表示
		System.out.println(ans);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] makeArray(int count) {
		// ランダムやつ
		Random random = new Random();
		// numbersに受け取った数（count）分の要素を持つ配列を生成
		int[] numbers = new int[count];
		// 1〜100までのランダムな値を生成し、for文で入れ、順番に表示する
		for (int i = 0; i < count; i++) {
			numbers[i] = random.nextInt(100) + 1; // 1〜100の数値
			System.out.println(numbers[i]);
		}
		// 配列を返す
		return numbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double arrayAve(int[] numbers) {
		// 配列の要素の値の合計を入れる変数
		double sum = 0;
		// 配列の要素の平均値を入れる変数
		double ave = 0;
		// numbersの各要素をfor文で足していく
		for (int number : numbers) {
			sum += number;
		}
		// 合計値を要素数分で割る
		ave = sum / numbers.length;
		// 表示
		System.out.println(ave);
		// 平均値、返す
		return ave;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean isAveOver(double ave) {
		// aveが50以上ならtrue、それ以外はfalse
		if (ave >= 50) {
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}
	}

	public static void main(String[] args) {
		// Q1.のメソッド
		System.out.println("Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド");
		helliJava("JavaSE", 11);
		System.out.println("");

		// Q2.のメソッド
		System.out.println("Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド");
		keisan(2, 7);
		System.out.println("");

		// Q3.のメソッド
		System.out.println("Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド");
		int[] haireru1 = { 1, 2, 3 };
		hairetu(haireru1);
		System.out.println("");

		// Q4.のメソッド
		System.out.println("Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力");
		keisan(3.3, 4.4);
		System.out.println("");

		// Q5.のメソッド
		System.out.println("Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して格納した値を順番にコンソールで出力後、"
				+ "格納した値を返すメソッド。※0は出力＆格納しない。");
		// Q6で使うためにreturnされた配列をrandomArray[]に代入しておく
		int randomArray[] = makeArray(5);
		System.out.println("");

		// Q6.のメソッド
		System.out.println("Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッド。\n"
				+ "※小数点以下も表示されるように");
		// Q5でreturnした配列を渡す
		// Q7で使うためにreturnされた値をhanteiに代入
		double hantei = arrayAve(randomArray);
		System.out.println("");

		// Q7.のメソッド
		System.out.println("Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力");
		// Q6でreturnされた値を渡す
		isAveOver(hantei);
	}

}
