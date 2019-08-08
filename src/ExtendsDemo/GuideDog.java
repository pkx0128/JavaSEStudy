package ExtendsDemo;

//定义GuideDog继承于Dog基类
public class GuideDog extends Dog {
	public String dest;
	public void guideTo (String dest) {
		System.out.println("导航到"+dest);
	}
	public void shout() {//方法重写
		System.out.println("重写父类的shout方法");
	}
	public void shout(String name) {//方法重载
		System.out.println("hi,"+name+"，这是一个方法重载实例");
	}
}
