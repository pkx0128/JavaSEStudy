package StringDemo;

import java.util.List;
import java.util.Iterator;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	String的split方法实例
		String str = "This is a java project";
		String[] sArray = str.split(" ");
		for(String ss:sArray) {
			System.out.println(ss);
		}
		
//		StringBuffer实例
		StringBuffer sb = new StringBuffer("HelloWorld");
		sb.append("test");
		sb.insert(5, " ");
		System.out.println(sb.toString());
		
//		StringTokenize实例
		String s = "name=pankx&age=18";
		StringParse sp = new StringParse();
		List<String> lt = sp.parse(s, "&");
		Iterator<String> it = lt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
