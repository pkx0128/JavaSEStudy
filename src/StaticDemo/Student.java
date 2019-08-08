package StaticDemo;

public class Student {
	//定义静态属性schoolName
	public static String schoolName;
	public String name;
	public String sex;
//	定义静态方法
	public static void sayHi() {
		System.out.println("This is static method");
	}
	public void display() {
		System.out.println("SchoolName= "+schoolName+"\nname= "+name+"\nsex= "+sex);
	}
}
