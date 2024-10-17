package curriculum_1_22_sub;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {
	//フィールド
	private String helloMessage;
	private String sushiUmai;
	private String sushiIsWasyoku;
	private String NowDateTime;

	// コンストラクタ
	public Process(String helloMessage, String sushiUmai, String sushiIsWasyoku) {
		super();
		this.helloMessage = helloMessage;
		this.sushiUmai = sushiUmai;
		this.sushiIsWasyoku = sushiIsWasyoku;
		this.NowDateTime = getNowDateTime();
	}

	// 時間ゲット()
	private String getNowDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return now.format(formatter);
	}

	public void printMessages() {
		System.out.println(this.helloMessage);
		System.out.println(this.sushiUmai);
		System.out.println(this.sushiIsWasyoku);
		System.out.println("今の現在日時は" + this.getNowDateTime() + "です");
	}

}
