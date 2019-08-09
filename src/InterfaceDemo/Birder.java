package InterfaceDemo;
//定义Birder类并实现CanFly接口
class Birder implements CanFly {
	
	public void fly() {
		System.out.println("实现接口CanFly中的fly方法");
	}
}