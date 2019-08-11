/**
 * 定义Students类
 */
package CollectionsDemo;

import java.util.Date;

public class Students {
	private long num;
	private String name;
	private String sex;
	private Date birthday;
	
	public void setNum(long num) {
		this.num =  num;
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
}
