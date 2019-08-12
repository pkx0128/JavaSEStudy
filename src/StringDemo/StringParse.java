package StringDemo;

import java.util.List;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class StringParse {
	public List<String> parse(String s,String token){
		List<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(s,token);
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		return list;
	}
}
