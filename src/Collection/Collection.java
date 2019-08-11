package Collection;

import java.util.Queue;
import java.util.LinkedList;

public class Collection  {
	
	public static void main(String[] agrs) {
//		int code = new SetDemo().hashCode();
//		System.out.println(code);
		SetDemo.getSetDemo();;
		SetDemo.getLinkedHashSet();
		SetDemo.getTreeSet();
		ListDemo.getListDemo();
		System.out.println("队列实例开始*****************");
		Queue  queue = new LinkedList();
		queue.add("java");
		queue.add("php");
		QueueDemo.printQ(queue);
		System.out.println(queue.peek());
		
		System.out.println("Map实例开始*****************");
		MapDemo.getMapDemo();
		
	} 
}
