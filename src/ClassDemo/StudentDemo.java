package ClassDemo;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=null;
		System.out.println("student的值为："+student);
//		创建student对象
		student = new Student();
//		输入对象的属性值
		System.out.println("name:"+student.name+" age:"+student.age+" sex:"+student.sex);
			
//		给对象属性赋值
		student.name = "pankx";
		student.age = 29;
		student.sex = "男";
//		输入对象的属性值
		System.out.println("name:"+student.name+" age:"+student.age+" sex:"+student.sex);
	
	}

}
