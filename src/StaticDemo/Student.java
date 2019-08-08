package StaticDemo;

public class Student {
	//定义静态属性schoolName
	public static String schoolName;
	public String name;
	public String sex;
//	定义类的静态代码块，主要用于初始化静态属性的值
	static {
		schoolName = "市二中";
		System.out.println("类的静态代码块！");
	}
//	定义静态方法
	public static void sayHi() {
		System.out.println("This is static method");
	}
	public void display() {
		System.out.println("SchoolName= "+schoolName+"\nname= "+name+"\nsex= "+sex);
	}
}
