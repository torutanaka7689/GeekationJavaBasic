package basicSyntax;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("hoge").append("huga");
		
		sb.insert(4,",");
		
		sb.replace(4, 5,"there");
		
		sb.delete(4, 9);
		
		String result = sb.toString();
		System.out.println(result);
		
		List<String> arList = new ArrayList<>();
		
		arList.add("JP");
		arList.add("EN");
		arList.add("KR");
		
		System.out.println(arList.get(0));
		System.out.println(arList.get(1));
		System.out.println(arList.get(2));
		
		arList.remove("KR");
		
		System.out.println(arList.size());
	}

}
