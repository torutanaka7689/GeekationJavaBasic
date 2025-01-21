package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		results(a,b);
		
	}
	
	public static int addNumbers(int a,int b) {
		return  a + b;
	}
	
	public static int subNumbers(int a,int b) {
		int sub = a - b;
		
		return sub;

	}
	
	public static int mulNumbers(int a,int b) {
		int mul = a * b;
		
		return mul;
	}
	
	public static int divNumbers(int a,int b) {
		int div = a / b;
		
		return div;
	}
	
	public static void results(int a,int b) {
		
		int addresult = addNumbers(a,b);
		int subresult = subNumbers(a,b);
		int mulresult = mulNumbers(a,b);
		int divresult = divNumbers(a,b);
		
		System.out.println("計算結果は" + addresult + "です。");
		System.out.println("計算結果は" + subresult + "です。");
		System.out.println("計算結果は" + mulresult + "です。");
		System.out.println("計算結果は" + divresult + "です。");
		
	}

}
