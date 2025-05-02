package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// 数字の比較
		int a = 9;
		int b = 10;
		
		boolean greater = (a < b);
		
		System.out.println(greater);
		
		// 天気の一致
		int isSunny = 1;
	    int isWarm = 2;
	  
	    boolean andResult1 = (isSunny == 1 && isWarm ==2);
	    
	    System.out.println(andResult1);
		
		// ０以上かつ偶数かどうかの確認
	    int x = 12;
	    int y = 36;
	    
	    boolean andResult2 = (x >= 0 && y % 2 == 0);
	    
	    System.out.println(andResult2);
	    
		// 論理否定
	    int hasPermission = 1;
	    
	    boolean notResult = !(hasPermission == 2);
	    
	    System.out.println(notResult);
	}

}
