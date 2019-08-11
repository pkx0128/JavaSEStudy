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
		
		List<Students> list2 = new ArrayList<Students>();
		for(int j = 10;j>0;j--) {
			Students students = new Students();
			students.setNum((long)(j+10));
			students.setName("xiaoming"+j);
			if(j%2==0) {
				students.setSex("男");
			}else {
				students.setSex("女");
			}
			students.setBirthday(new Date());
			list2.add(students);
		}
		System.out.println("排序前的学生信息");
		System.out.println("================================================");
		Iterator<Students> iterator3 = list2.iterator();
		while(iterator3.hasNext()) {
			Students ss = iterator3.next();
			System.out.println("学号："+ss.getNum()+" 姓名："+ss.getName()+" 姓别："+ss.getSex()+" 生日："+ss.getBirthday());
		}
//		按学号排序
//		Collections.sort(list2,new SortToNumber());
//		按名字排序
		Collections.sort(list2,new SortToName());
		System.out.println("排序后的学生信息");
		System.out.println("================================================");
//		使用迭代器遍历并输入list中的学生信息
		Iterator<Students> iterator4 = list2.iterator();
		while(iterator4.hasNext()) {
			Students ss2 = iterator4.next();
			System.out.println("学号："+ss2.getNum()+" 姓名："+ss2.getName()+" 姓别："+ss2.getSex()+" 生日："+ss2.getBirthday());
		}
	}
	
}
