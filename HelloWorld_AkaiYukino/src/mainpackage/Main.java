package mainpackage;

import subpackage.PlayerStatus;

public class Main {

	public static void main(String[] args) {
		// PlayerStatusからnew
		PlayerStatus player = new PlayerStatus("名前");
		// PlayerStatusにあるdisplayStatus()を呼び出す
		player.displayStatus();

	}

}
