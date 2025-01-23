package objectPractice;

public class Main {

	public static void main(String[] args) {
		//クラス・オブジェクト・インスタンス・コンストラクタのチュートリアル
		
		Geekdam geekdamA = new Geekdam("geekdamA","赤",22,175.5);
		Geekdam geekdamB = new Geekdam("geekdamB","青",25,185.5);
		
		System.out.println(geekdamA.name);
		System.out.println(geekdamA.color);
		System.out.println(geekdamA.age);
		System.out.println(geekdamA.height);
		
		System.out.println(geekdamB.name);
		System.out.println(geekdamB.color);
		System.out.println(geekdamB.age);
		System.out.println(geekdamB.height);
		
		
		geekdamA.greeting();
		
		//ゲッター・セッターのチュートリアル
		
		Sample sample = new Sample("Geek","太郎");
		
		System.out.println(sample.getLastname());
		System.out.println(sample.getFirstname());
		
		sample.setLastname("Geekation");
		sample.setFirstname("二郎");
		
		System.out.println(sample.getLastname());
		System.out.println(sample.getFirstname());
		
		//継承のチュートリアル
		
		Dog dog = new Dog("しば太郎","柴犬",9.5,"セラピードッグ");
		dog.greeting();
		
		Cat cat = new Cat("スコット","スコティッシュフォールド",3.8);
		cat.greeting();
		
		System.out.println(dog.name);
	}

}
