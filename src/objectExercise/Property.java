package objectExercise;

public class Property {
	protected String name;
	protected String owner;
	protected String type;
	protected String price;
	
	Property(String name,String owner,String type,String price){
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}
	
	public void info() {
		System.out.println("物件名：" + this.name );
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.type);
		System.out.println("物件価格：" + this.price);
		
	}
	
	//ゲッター
	public String getname() {
		return this.name;
	}
	
	public String getowner() {
		return this.owner;
	}
	
	public String gettype() {
		return this.type;
	}
	
	public String getprice() {
		return this.price;
	}
	
	//セッター
	public void setname(String name) {
		this.name = name;
	}
	
	public void setowner(String owner) {
		this.owner = owner;
	}
	
	public void settype(String type) {
		this.type = type;
	}
	
	public void setprice(String price) {
		this.price = price;
	}
	
}
