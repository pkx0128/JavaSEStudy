package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
//	HashSet实例
	public static void GetSetDemo() {
		HashSet hashset = new HashSet();
		hashset.add("java");
		hashset.add("C++");
		hashset.add("java");
		hashset.add("c");
		Iterator iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
