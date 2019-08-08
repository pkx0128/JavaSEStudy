package AbstractDemo;
//继承基类Person
public class Xiaoming extends Person{
	public Xiaoming(String name,int age) {
		super(name,age);//调用父类的构造方法
	}
	
	public void output() {//重写父类的抽象方法
		System.out.println("这是一个抽象类实例");
	}

}
