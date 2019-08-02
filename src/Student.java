/**
 *创建一个学生类并实现按照学号升序排列 
 * @author pankx
 *1.自定义类型数组使用Arrays.sort()排序需要实现接口Comparable接口
 *2.并且重写compareTo方法并定义规则
 *
 */
class Student implements Comparable<Student> {
	int studentNo;
	String studentName;
	public Student(int studentNo){
		this.studentNo = studentNo;
	}
//	重写compareTo方法
	public int compareTo(Student student) {
		//定义升序排序规则
		if(this.studentNo<student.studentNo) {
			return -1;
		}else if(this.studentNo>student.studentNo) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
	
}