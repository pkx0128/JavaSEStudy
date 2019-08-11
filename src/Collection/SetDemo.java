package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
//	HashSet实例,无序
	public static void getSetDemo() {
		HashSet hashset = new HashSet();
		hashset.add("java");
		hashset.add("C++");
		hashset.add("java");
		hashset.add("c");
		Iterator iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=============================");
	}
	
//	LinkedHashSet实例，按插入顺序
	public static void getLinkedHashSet() {
		LinkedHashSet linkedhashset = new LinkedHashSet();
		linkedhashset.add("php");
		linkedhashset.add("python");
		linkedhashset.add("ruby");
		Iterator iterator = linkedhashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("=============================");
	}
	
//	TreeSet实例，自然顺序
	public static void getTreeSet() {
		TreeSet treeset = new TreeSet();
		treeset.add("c");
		treeset.add("ajax");
		treeset.add("javascript");
		Iterator iterator = treeset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
