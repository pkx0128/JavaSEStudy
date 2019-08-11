package Collection;

import java.util.ArrayList; 
import java.util.Iterator;

public class ListDemo {
	public static void getListDemo() {
		System.out.println("List实例开始*************************");
		ArrayList arraylist = new ArrayList();
		arraylist.add("java");
		arraylist.add("php");
//		使用Iterator遍历ArrayList
		Iterator iterator = arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		使用for循环遍历arraylist
		System.out.println("使用for循环遍历arraylist *******************");
		for (int i = 0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
	}
}
