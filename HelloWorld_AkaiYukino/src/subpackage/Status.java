package subpackage;

import java.util.Random;

public class Status {
	// フィールド
	private String name; //名前
	private int hp; //HP
	private int mp; //MP
	private int atkPower; //攻撃力
	private int speed; //素早さ
	private int defense; //防御力

	// コンストラクタ
	public Status(String name) {
		super();
		Random random=new Random();
		this.name = name;
		// ランダムで数値入れる
		this.hp = random.nextInt(1000);
		this.mp = random.nextInt(1000);
		this.atkPower = random.nextInt(1000);
		this.speed = random.nextInt(1000);
		this.defense = random.nextInt(1000);
	}

	// getter/setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null||name == " ") {
			throw new IllegalArgumentException("名前がnullのため、処理を中断");
		}
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtkPower() {
		return atkPower;
	}

	public void setAtkPower(int atkPower) {
		this.atkPower = atkPower;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

}
