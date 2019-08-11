package CollectionsDemo;

import java.util.Date;
/**
 *使用工具类Collections中的sort方法排序集合中的自定义元素
 *1.定义自定义类Student并实现接口Comparable<自定义类名>
 *2.重写接口中的compareTo方法并设置排序方式 
 *3.创建类实例的元素的集合 如List<student>
 *4.直接调用Collections.sort()对集合中的元素按预先设置的排序规则进行排序;
 *
 */
//实现Comparable接口并重写接口的compareTo方法设置排序
public class Student implements Comparable<Student> {
	
	private long num;
	private String name;
	private String sex;
	private Date birthday;
	
	public void setNum(long num) {
		this.num = num;
	}
	
	public long getNum() {
		return num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	@Override
//	设置排序方式为升序
	public int compareTo(Student stu) {
		if(this.num>stu.num) {
			return 1;
		}else if(this.num < stu.num) {
			return -1;
		}else {
			return 0;
		}
	}
}
