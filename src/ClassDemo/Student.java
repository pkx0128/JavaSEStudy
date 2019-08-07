package ClassDemo;
/**
 * 创建Student类
 * @author pankx
 *
 */
public class Student {
	String name;
	int age;
	String sex;
//	定义构造方法
	public Student(String name){
		this(name,28);
		System.out.println("一个参数的构造方法");
	}
	
	Student(String name,int age){
		this(name,age,"男");
		System.out.println("两个参数的构造方法");
	}
	Student(String name,int age,String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("三个参数的构造方法");
	}
}
