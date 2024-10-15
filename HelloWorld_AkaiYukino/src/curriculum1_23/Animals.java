package curriculum1_23;

public class Animals {
	// フィールド
	// 動物名
	private String animalName;
	// 体長
	private double size;
	// 速度
	private double speed;

	// コンストラクタ
	public Animals(String animalName, double size, double speed) {

		this.animalName = animalName;
		this.size = size;
		this.speed = speed;
	}

	// ゲッターとセッター
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		if (animalName == null) {
			throw new IllegalArgumentException("名前がnullのため、処理を中断");
		}
		this.animalName = animalName;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	// メソッド
	public void name() {
		System.out.println("動物名:" + this.animalName);
	}

	public void size() {
		System.out.println("全長:" + this.size + "m");
	}

	public void speed() {
		System.out.println("速度:" + this.speed + "km/h");
	}
}
