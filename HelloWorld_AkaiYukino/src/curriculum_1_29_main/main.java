package curriculum_1_29_main;

import java.util.Arrays;
import java.util.Scanner;

import curriculum_1_29_sub.Prefecture;

public class main {

	public static void main(String[] args) {
		
		// 配列に各都道府県情報を入れていく
		Prefecture[] prefectures = new Prefecture[11];
		prefectures[0] = new Prefecture("北海道", "札幌市", 83424);
		prefectures[1] = new Prefecture("青森県", "青森市", 9646);
		prefectures[2] = new Prefecture("岩手県", "盛岡市", 15275);
		prefectures[3] = new Prefecture("宮城県", "仙台市", 7282);
		prefectures[4] = new Prefecture("秋田県", "秋田市", 11638);
		prefectures[5] = new Prefecture("山形県", "山形市", 9323);
		prefectures[6] = new Prefecture("福島県", "福島市", 13784);
		prefectures[7] = new Prefecture("茨城県", "水戸市", 13784);
		prefectures[8] = new Prefecture("栃木県", "宇都宮市", 6408);
		prefectures[9] = new Prefecture("群馬県", "前橋市", 6363);
		prefectures[10] = new Prefecture("埼玉県", "さいたま市", 3798);

		
		// 数字入力
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を「,」区切りで入力");
		String inputNum = scanner.nextLine();
		// 空の入力チェック
		if (inputNum.isEmpty()) {
			System.out.println("数字が入力されていません。");
			return;
		}
		// 昇順 or 降順を入力
		System.out.println("昇順 or 降順を入力");
		String sortOrder = scanner.nextLine();
		if (sortOrder.isEmpty()) {
			System.out.println("昇順 or 降順入力が入力されていません。");
			return;
		}

		// 受け取ったinpNumを「,」で分け、配列へ
		String[] sNumbers = inputNum.split("[,]");
		// numbers配列（String）の型をintに変換
		int[] intNumbers = new int[sNumbers.length];
		// for文で中に入ってる要素も変換（sNumber→intNumberに）
		for (int i = 0; i < sNumbers.length; i++) {
			intNumbers[i] = Integer.parseInt(sNumbers[i]);
		}

		// 昇順か降順かの処理
		if (sortOrder.equals("昇順")) {
			// 昇順に並び替え
			Arrays.sort(intNumbers);
			for (int i = 0; i < intNumbers.length; i++) {
				prefectures[i].display();
			} //for

		} else if (sortOrder.equals("降順")) {
			// 並び替え
			Arrays.sort(intNumbers);
			// 降順に並べ替え表示
			for (int i = intNumbers.length - 1; i >= 0; i--) {
				prefectures[i].display();
			} //for

		} else {
			System.out.println("");
		} //if

		scanner.close();

	}

}
