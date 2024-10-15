package subpackage;

public class PlayerStatus extends Status {

	public PlayerStatus(String name) {
		super(name);
		
	}

	public void displayStatus() {
		System.out.println("こんにちは 「" + this.getName() + "」 さん");
		System.out.println("ステータス");
		System.out.println("HP:" + this.getHp());
		System.out.println("MP：" + this.getMp());
		System.out.println("攻撃力：" + this.getAtkPower());
		System.out.println("素早さ：" + this.getSpeed());
		System.out.println("防御力：" + this.getDefense());
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
	}

}
