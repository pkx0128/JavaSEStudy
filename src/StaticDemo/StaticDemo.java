package StaticDemo;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//设置静态属性的值
		Student.schoolName = "市一中";
		Student xiaoming = new Student();
		xiaoming.name = "xiaoming";
		xiaoming.sex = "男";
		xiaoming.display();
//		调用静态方法
		Student.sayHi();
	}

}
