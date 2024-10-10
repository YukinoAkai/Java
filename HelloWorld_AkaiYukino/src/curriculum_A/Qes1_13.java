package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		/**************************************************
		 * Q1.下記9個をローカル変数として宣言のみしてください
		 * ・バイト型・短整数型・整数型・長整数型・単精度浮動小数点数型・倍精度浮動小数点数型・文字型・文字列型・ブーリアン型
		 * Q2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		 **************************************************/

		// バイト型
		byte byteVar = 0;

		// 短整数型
		short shortVar = 0;

		// 整数型
		int intVar = 0;

		// 長整数型
		long longVar = 0L;

		// 単精度浮動小数点数型
		float floatVar = 0.0f;

		// 倍精度浮動小数点数型
		double doubleVar = 0.0d;

		// 文字型
		char charVar = '\u0000';

		// 文字列型
		String stringVar = "";

		// ブーリアン型
		boolean booleanVar = false;

		/**************************************************
		 * Q3.初期化をしたそれぞれの変数に下記の値を代入してください
		 ***************************************************/

		byteVar = 10;
		shortVar = 100;
		intVar = 1000;
		longVar = 10000;
		floatVar = 9.5f;
		doubleVar = 10.5d;
		charVar = 'a';
		stringVar = "ハロー";
		booleanVar = true;

		/**************************************************
		 * Q4.下記の通りにコンソール出力されるようにしてください
		 * 上記で作成した変数を必ず使用すること
		 * 
		 ***************************************************/

		System.out.println("Q4");
		// 「11110」と出力される
		System.out.println(byteVar + shortVar + intVar + longVar);
		// 「20」と出力される
		System.out.println(floatVar + doubleVar);
		// 「a ハロー true」と出力される
		System.out.println(charVar + " " + stringVar + " " + booleanVar);
		// 「11130」と出力される（数字を全て足す）
		System.out.println(byteVar + shortVar + intVar + longVar + floatVar + doubleVar);
		// 「10000000000」と出力される（小数点以外の数字を全てかける）
		System.out.println(byteVar * shortVar * intVar * longVar);
		// 「0.105」と出力される（10.5割る100をする）
		System.out.println(doubleVar / shortVar);
		// 「-90」と出力される（10引く100をする）
		System.out.println(byteVar - shortVar);
		System.out.println(""); // 改行
		
		/**************************************************
		 * Q5.次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		 * 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 *  String num="20";
		 *  int num1=23;
		 *  System.out.println("ハローJAVA"+(num+num1));
		 ***************************************************/

		System.out.println("Q5");
		String num = "20";
		int num1 = 23;
		// String→intに変換
		System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
		System.out.println(""); // 改行

		/**************************************************
		 * Q6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 *  ローカル変数に代入し○○に入れてください
		 *  『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 *  ↓format↓↓
		 *  「初めまして○○です」「年齢は○○歳です」「身長は○○cmです」「体重は○○kgです」「好きな食べ物は○○です」
		 ***************************************************/

		// 名前
		String name = "山田太郎";
		// 年齢
		int age = 18;
		// 身長cm
		double height = 170.5;
		// 体重kg
		double weight = 62.2;
		// 好きな食べ物
		String likeFood = "寿司";
		// 出力
		System.out.println("Q6");
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + likeFood + "です");
		System.out.println(""); // 改行

		/**************************************************
		* Q7.「Q6」で作成した自己紹介に続いてBMIが出力されるようにしてください
		* 「BMIは○○です」
		* ただし計算は数値を直書きせず、全て変数を使ってすること
		***************************************************/

		System.out.println("Q7");
		double meHeight = height / 100; // メートルに
		// BMI = 体重　÷ (身長 × 身長)
		double bmi = weight / (height * height);
		// 出力
		System.out.printf("BMIは %.1fです\n", bmi);
		System.out.println(""); // 改行

		/**************************************************
		* Q8.「Q6」で宣言した変数に再代入し下記の通りコンソールに出力してください
		* 「初めまして鈴木一郎です」「年齢は24歳です」「身長168.5cmです」「体重は64.2kgです」
		* 「好きな食べ物はオムライスです」「BMIは22.6です」
		***************************************************/

		System.out.println("Q8");
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		likeFood = "オムライス";
		// BMI = 体重　÷ (身長 × 身長)
		bmi = weight / (meHeight * meHeight);
		// 出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + likeFood + "です");
		System.out.printf("BMIは %.1fです\n", bmi);
		System.out.println(""); // 改行

		/**************************************************
		* Q9.「Q8」で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		* 「初めまして鈴木一郎です」「年齢は48歳です」「身長337.0cmです」「体重は128.4kgです」
		* 「好きな食べ物はオムライスです」「BMIは11.31です」
		***************************************************/

		System.out.println("Q9");
		age += age; //和算で自己代入
		height += height; //和算で自己代入
		weight += weight; //和算で自己代入
		meHeight = height / 100; // メートルに
		// BMI = 体重　÷ (身長 × 身長)
		bmi = weight / (meHeight * meHeight);
		// 出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + likeFood + "です");
		System.out.printf("BMIは %.2fです\n", bmi);
		System.out.println(""); // 改行

		/**************************************************
		* Q10.「Q8」で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		***************************************************/

		System.out.println("Q10");
		// if文不可なので、三項演算子で判断
		boolean isAgeOver25 = (age >= 25) ? true : false;
		// 出力
		System.out.println(isAgeOver25);
		System.out.println(""); // 改行

		/**************************************************
		* Q11.「Q8」で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		***************************************************/

		System.out.println("Q11");
		// int→String変換
		String ageStr = String.valueOf(age);
		String heiStr = String.valueOf(height);
		String weiStr = String.valueOf(weight);
		// 出力
		System.out.println(ageStr + heiStr + weiStr);
		System.out.println(""); // 改行

		/**************************************************
		* Q12.「Q11」で変換した【年齢・身長】を整数型に変換して出力してください
		***************************************************/

		System.out.println("Q12");
		// String→int変換
		int ageInt = Integer.parseInt(ageStr);
		int heiInt = (int) Double.parseDouble(heiStr);
		// 出力
		System.out.println(ageInt + " " + heiInt);
		System.out.println(""); // 改行

		/**************************************************
		* Q13.「12」で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		* ただしif文は使わないでください
		***************************************************/

		System.out.println("Q13");
		// if文不可なので、三項演算子で判断
		boolean isAgeOver25andHeiOver160 = (ageInt >= 25 || heiInt >= 160) ? true : false;
		// 出力
		System.out.println(isAgeOver25andHeiOver160);

	}

}
