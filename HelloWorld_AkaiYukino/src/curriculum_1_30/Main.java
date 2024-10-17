package curriculum_1_30;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();

		// q4
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		// carの所有者
		car.setOwner(person1.fullName());
		// bicycleの所有者
		bicycle.setOwner(person2.fullName());

		// q10
		person1.buy(car);
		person2.buy(bicycle);
	}

}
