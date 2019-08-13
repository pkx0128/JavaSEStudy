package DateFormatDemo;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		String s;

//		Date:类的格式 Tue Aug 13 02:38:50 CST 2019
		System.out.println(d);

//		DateFormat.getDateInstance()的默认输出格式 2019-8-13
		s = DateFormat.getDateInstance().format(d);
		System.out.println(s);
		
//		DateFormat.getDateInstance(DateFormat.DEFAULT) 输出格式 2019-8-13
		s = DateFormat.getDateInstance(DateFormat.DEFAULT).format(d);
		System.out.println(s);
		
//		DateFormat.getDateInstance(DateFormat.SHORT) 输出格式 19-8-13
		s = DateFormat.getDateInstance(DateFormat.SHORT).format(d);
		System.out.println(s);
		
//		DateFormat.getDateInstance(DateFormat.MEDIUM) 输出格式 2019-8-13
		s = DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		System.out.println(s);
		
//		DateFormat.getDateInstance(DateFormat.LONG) 输出格式 2019年8月13日
		s = DateFormat.getDateInstance(DateFormat.LONG).format(d);
		System.out.println(s);
		
//		 DateFormat.getDateInstance(DateFormat.FULL) 输出格式为 2019年8月13日 星期二
		s = DateFormat.getDateInstance(DateFormat.FULL).format(d);
		System.out.println(s);
		
		SimpleDateFormatDemo.getFormatDemo();
	}

}
