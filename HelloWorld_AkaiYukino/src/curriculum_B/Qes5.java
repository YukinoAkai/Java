package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		/************
		 * Q5.for文を使用して下記の通りに出力してください
		 *************/
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(String.format((" %03d * %03d = %03d ||"), i, j, i * j));
			}
			// 1段ずつ分ける
			System.out.println("");
		}
	}

}
