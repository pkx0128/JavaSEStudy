package EncapsulationDemo;
//封装实例
public class Persion {
	private String name;
	private int age;
//	设置name属性值
	public void setName(String name) {
		this.name = name;
	}
//	获取name属性值
	public String getName() {
		return name;
	}
//	设置年龄
	public void setAge(int age) {
		if(0<age&&age<120) {//判断输入的年龄是否合法
			this.age = age;
		}else {
			System.out.println("年龄输入不合法！");
		}
	}
//	获取年龄的值
	public int getAge() {
		return age;
	}
	
	
	
	
}
