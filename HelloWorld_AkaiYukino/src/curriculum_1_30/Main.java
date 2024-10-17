package curriculum_1_30;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60, 0);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		person1.bmi(person1.height, person1.weight);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40, 0);
		person2.print();

		Person.printCount();

	}

}
