package curriculum_1_30;

class Person {
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	public String lastName;

	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	/* q6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	 * q7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう
	 * q8：さらに、「〇〇が購入しました」と出力する処理を追加してください。*/
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(this.fullName() + "が購入しました");
	}
	// q9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(this.fullName() + "が購入しました");
	}



}
