package ExtendsDemo;

//定义基类Dog
public class Dog {
	private String name;//私有属性不能被继承
	double wieght;
	protected String color;
	public int age;
	public void shout() {
		System.out.println("汪汪汪");
	}
}
