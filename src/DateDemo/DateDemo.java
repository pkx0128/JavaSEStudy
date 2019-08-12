package DateDemo;

import java.util.Calendar;
import java.util.Date;
public class DateDemo {

	public static void main(String[] agrs) {
//		Date的简单实例
		Date date = new Date();
		System.out.println(date.toString());
		
//		用Calendar类计算当前日期距离生日多少天
//		生日1月28号
		Calendar cnow = Calendar.getInstance();
		Calendar cbirthday = Calendar.getInstance();
		if(cnow.get(Calendar.MONTH)>0) {
			cbirthday.set(Calendar.YEAR,cnow.get(Calendar.YEAR)+1);
		}else if(cnow.get(Calendar.MONTH) == 0 && cnow.get(Calendar.DAY_OF_MONTH)>28) {
			cbirthday.set(Calendar.YEAR,cnow.get(Calendar.YEAR)+1);
		}
		cbirthday.set(Calendar.MONTH,0);
		cbirthday.set(Calendar.DAY_OF_MONTH,28);
		
		long cbirthdayMillis = cbirthday.getTimeInMillis();
		long cnowMillis = cnow.getTimeInMillis();
		long dayMillis = 0;
		if(cnow.after(cbirthday)) {
			dayMillis = cnowMillis - cbirthdayMillis;
		}else {
			dayMillis = cbirthdayMillis - cnowMillis;
		}
			int day = (int)(dayMillis/1000/60/60/24);	
			System.out.println("距离你的生日还有"+day+"天");
	}
	
	
	
}
