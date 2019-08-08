package AbstractDemo;
//定义抽象方法Person，抽象方法不能被实例化对象
abstract class Person {
	private String name;
	private int age;
//	构造方法
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
//	设置名字
	public void setName(String name) {
		this.name = name;
	}
//	设置年龄
	public void setAge(int age) {
		this.age = age;
	}
//	获取名字
	public String getName() {
		return name;
	}
//	获取年龄
	public int getAge() {
		return age;
	}
//	抽象方法output
	public abstract void output();
}