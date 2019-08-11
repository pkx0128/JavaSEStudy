/**
 * 定义按名字排序的规则类
 */
package CollectionsDemo;

import java.util.Comparator;

public class SortToName implements Comparator<Students> {

	public int compare(Students st1,Students st2) {
		return st1.getName().compareTo(st2.getName());
	}

}
