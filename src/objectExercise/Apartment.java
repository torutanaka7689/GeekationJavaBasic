package objectExercise;

public class Apartment extends Property {
	
	private String plan;
	
	Apartment(String name,String owner,String type,String price,String plan){
		super(name,owner,type,price);
		this.plan = plan;
	}
	
	public void info() {
		super.info();
		System.out.println("間取り：" + this.plan);
	}
	
	//ゲッター
	public String getplan() {
		return this.plan;
	}
	
	//セッター
	public void setplan(String plan) {
		this.plan = plan;
	}

}
