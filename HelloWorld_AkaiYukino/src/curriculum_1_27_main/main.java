package curriculum_1_27_main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import curriculum_1_27_sub.Animal;

public class main {

	public static void main(String[] args) {

		// 動物名と学名を紐つけ
		Map<String, String> speciesNameMap = new HashMap<String, String>();
		speciesNameMap.put("ライオン", "パンテラ レオ");
		speciesNameMap.put("ゾウ", "ロキソドンタ・サイクロティス");
		speciesNameMap.put("パンダ", "アイルロポダ・メラノレウカ");
		speciesNameMap.put("チンパンジー", "パン・トゥログロディテス");
		speciesNameMap.put("シマウマ", "チャップマンシマウマ");
		speciesNameMap.put("インコ", "不明");

		// 文字入力の入力
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください:");
		String inp = scanner.nextLine();
		// 入力されたものを,で分けて配列に入れる（動物別）
		String[] inpWords = inp.split("[,]");
		// ,で分けたinpWordsを:でさらに順番に分けていく（名前と数字別）
		for (String animalData : inpWords) {
			String[] animalArray = animalData.split("[:]");
			// 引数に入れるため一度変数へ
			// 0番目は名前
			String animalName = animalArray[0];
			// 1番目は速度(Stringからdoubleに変換)
			double speed = Double.parseDouble(animalArray[1]);
			// 2番目は全長(Stringからdoubleに変換))
			double size = Double.parseDouble(animalArray[2]);
			// 学名
			String scientificName = speciesNameMap.get(animalName);
			// newして↑たち入れる
			Animal animal = new Animal(animalName, speed, size, scientificName);
			// 表示
			animal.display();
		} //for
		
		scanner.close();
	}

}
