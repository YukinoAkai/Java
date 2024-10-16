package curriculum_1_27_sub;

public class Animal {
	// フィールド
	// 動物名
	private String animalName;
	// 体長
	private double size;
	// 速度
	private double speed;
	// 学名
	private String scientificName;

	// コンストラクタ
	public Animal(String animalName, double size, double speed, String scientificName) {
		super();
		this.animalName = animalName;
		this.size = size;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
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

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	// 表示するメソッド
	public void display() {
		System.out.println("動物名：" + this.animalName);
		System.out.println("体長：" + this.size + "m");
		System.out.println("速度：" + this.speed + "km/h");
		System.out.println("学名：" + this.scientificName);
		System.out.println("");
	}
}
