package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		System.out.println("計算結果は"+addNumbers(10,5)+"です。");
		System.out.println("計算結果は"+subNumbers(10,5)+"です。");
		System.out.println("計算結果は"+mulNumbers(10,5)+"です。");
		System.out.println("計算結果は"+divNumbers(10,5)+"です。");
	}
	
	public static int addNumbers(int num1,int num2) {
		int sum = num1 + num2;
		
		return sum;

	}
	
	public static int subNumbers(int num1,int num2) {
		int sub = num1 - num2;
		
		return sub;

	}
	
	public static int mulNumbers(int num1,int num2) {
		int mul = num1 * num2;
		
		return mul;
	}
	
	public static int divNumbers(int num1,int num2) {
		int div = num1 / num2;
		
		return div;
	}

}
