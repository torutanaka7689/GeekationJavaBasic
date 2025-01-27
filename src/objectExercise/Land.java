package objectExercise;

public class Land extends Property{
	private String size;
	
	Land(String name,String owner,String type,String price,String size){
		super(name,owner,type,price);
		this.size = size;
	}
	
	public void info() {
		super.info();
		System.out.println("広さ：" + this.size);
	}
	
	//ゲッター
	public String getsize() {
		return this.size;
	}
	
	//セッター
	public void setsize(String size) {
		this.size = size;
	}

}
