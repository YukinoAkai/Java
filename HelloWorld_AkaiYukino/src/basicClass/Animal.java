package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog inuName = new Dog("犬");
		System.out.println(inuName.dogName);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog inuCount = new Dog(3);
		System.out.println(inuCount.dogCount);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 表示したいフォーマット
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// 現在時間取得
		LocalDateTime now = LocalDateTime.now();
		// 文字列に
		String nowTime = now.format(fmt);
		// 表示
		System.out.println(nowTime);

	}

}
