package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		int addresult = addNumbers(a,b);
		int subresult = subNumbers(a,b);
		int mulresult = mulNumbers(a,b);
		int divresult = divNumbers(a,b);
		
		results(addresult);
		results(subresult);
		results(mulresult);
		results(divresult);
	}
	
	public static int addNumbers(int a,int b) {
		return  a + b;
	}
	
	public static int subNumbers(int a,int b) {
		return  a - b;
	}
	
	public static int mulNumbers(int a,int b) {
		return a * b;
	}
	
	public static int divNumbers(int a,int b) {
		return a / b;
	}
	
	public static void results(int result) {
		
		System.out.println("計算結果は" + result + "です。");
		
	}

}
