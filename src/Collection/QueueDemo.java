package Collection;

import java.util.Queue;

public class QueueDemo {
	public static void printQ(Queue queue) {
		while(queue.peek() !=null) {
			System.out.println(queue.remove());
		}
		System.out.println("*********************");
	}
}
