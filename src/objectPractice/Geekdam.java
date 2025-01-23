package objectPractice;

public class Geekdam {
	public String name;
	public String color;
	public int age;
	public double height;
	
	Geekdam(String name,String color,int age ,double height){
		
		this.name = name;
		this.color = color;
		this.age = age;
		this.height = height;
		
		System.out.println("これがコンストラクタです。");
	}
	
	public void greeting() {
		System.out.println("やほ！ 私は" + this.name + "です。");
	}

}
