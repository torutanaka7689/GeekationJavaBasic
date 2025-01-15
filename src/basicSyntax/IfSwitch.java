package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {
		//if文の実装
		int num = 4;
		
		if(num % 2 == 0) {
			System.out.println("2の倍数です");
		}else if(num % 3 == 0) {
			System.out.println("3の倍数です");
		}else {
			System.out.println("どちらでもありません");
		}
		
		//swich文の実装
		String pref = "東京";
		
		switch (pref) {
			case "東京":
				System.out.println("東京都");
				break;
			
			case "京都":
				System.out.println("京都府");
				break;
				
			case "北海":
			    System.out.println("北海道");
			    break;
			    
			default:
				System.out.println("当てはまりません");
				break;
		}
	}

}
