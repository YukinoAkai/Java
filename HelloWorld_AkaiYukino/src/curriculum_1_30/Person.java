package curriculum_1_30;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight, int count) {

		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// コンストラクタ内でcount++
		Person.count++;
	}

	// bmiの変数
	double bmi = 0;

	// BIMのメソッド
	public double bmi(double height, double weight) {
		bmi = weight / (height * height);
		return bmi;

	}

	// printメソッド
	public void print() {
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "です。");
		System.out.println("BMIは" + bmi + "です。");
	}

	public static void printCount() {
		//this.count++;
		System.out.println("合計" + Person.count + "人です");

	}

}
