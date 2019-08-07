package packageDemo;
//引入ClassDemo包中的Student类
import ClassDemo.Student;
public class packageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		未引用包时，跨包访问来用包名
//		ClassDemo.Student std = new ClassDemo.Student("pankx");
//		引入用了ClassDemo包中的Student类后，直接用类名可方法其他包中的类
		Student std = new Student("pankx");
		
	}

}
