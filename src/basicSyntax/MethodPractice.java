package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println("計算結果は"+addNumbers(a,b)+"です。");
		System.out.println("計算結果は"+subNumbers(a,b)+"です。");
		System.out.println("計算結果は"+mulNumbers(a,b)+"です。");
		System.out.println("計算結果は"+divNumbers(a,b)+"です。");
	}
	
	public static int addNumbers(int a,int b) {
		int sum = a + b;
		
		return sum;

	}
	
	public static int subNumbers(int a,int b) {
		int sub = a - b;
		
		return sub;

	}
	
	public static int mulNumbers(int a,int b) {
		int mul = a * b;
		
		return mul;
	}
	
	public static int divNumbers(int num1,int num2) {
		int div = num1 / num2;
		
		return div;
	}

}
