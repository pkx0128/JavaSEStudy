/**
 * 定义按学号排序规则的类
 */
package CollectionsDemo;

import java.util.Comparator;

public class SortToNumber implements Comparator<Students> {
	
	public int compare(Students st1,Students st2) {
		if(st1.getNum() > st2.getNum()) {
			return 1;
		}else if(st1.getNum() < st2.getNum()) {
			return -1;
		}else {
			return 0;			
		}
	}
	
}
