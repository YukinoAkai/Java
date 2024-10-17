package curriculum_1_22_main;

import curriculum_1_22_sub.Process;

public class main {

	public static void main(String[] args) {

		Process process = new Process("こんにちは！ここは日本です！",
				"この寿司はうまい",
				"寿司は和食です");

		process.printMessages();

	}

}
