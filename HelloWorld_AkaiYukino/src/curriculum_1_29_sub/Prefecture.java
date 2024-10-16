package curriculum_1_29_sub;

public class Prefecture {

	// フィールド
	// 都道府県
	private String prefectureName;
	// 県庁所在地
	private String capitalCity;
	// 面積
	private double area;

	// コンストラクタ
	public Prefecture(String prefectureName, String capitalCity, double area) {
		super();
		this.prefectureName = prefectureName;
		this.capitalCity = capitalCity;
		this.area = area;
	}

	// ゲッターとセッター
	public String getPrefectureName() {
		return prefectureName;
	}

	public void setPrefectureName(String prefectureName) {
		this.prefectureName = prefectureName;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	// 表示するメソッド
	public void display() {
		System.out.println("都道府県名：" + this.prefectureName);
		System.out.println("県庁所在地：" + this.capitalCity);
		System.out.println("面積：" + this.area + "km2");
		System.out.println("");
	}
}
