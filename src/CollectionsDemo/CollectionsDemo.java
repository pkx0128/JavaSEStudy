package CollectionsDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] agrs) {
		List<Student> list = new ArrayList<Student>();
//		创建学生信息并加入list 中
		for (int i = 10;i>0;i--) {
			Student student = new Student();
			student.setNum((long)(i+20));
			student.setName("name"+i);
			student.setSex("男");
			student.setBirthday(new Date());
			list.add(student);
		}
//		使用迭代器遍历并输入list中的学生信息
		Iterator<Student> iterator = list.iterator();
		System.out.println("排序前的学生信息");
		System.out.println("================================================");
		while(iterator.hasNext()) {
			Student s = iterator.next();
			System.out.println("学号："+s.getNum()+" 姓名："+s.getName()+" 姓别："+s.getSex()+" 生日："+s.getBirthday());
		}
//		调用工具类Collections的sort方法排序
		Collections.sort(list);

		System.out.println("排序后的学生信息");
		System.out.println("================================================");
//		使用迭代器遍历并输入list中的学生信息
		Iterator<Student> iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			Student s2 = iterator2.next();
			System.out.println("学号："+s2.getNum()+" 姓名："+s2.getName()+" 姓别："+s2.getSex()+" 生日："+s2.getBirthday());
		}
		

	}
	
}
