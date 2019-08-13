package DateFormatDemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;



public class SimpleDateFormatDemo {
//	SimpleDateFormat格式化日期实例
	public static void getFormatDemo() {
		Date now = new Date();
//		显示格式为：2019年08月13日 22时57分28秒
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		System.out.println(sf.format(now));
//		显示格式为： 2019/08/13/ 22:59
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm");
		System.out.println(sf2.format(now));
//		显示格式为：2019-08-13 23:01:33
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf3.format(now));
//		显示格式为：2019年08月13日 23时11分51秒星期二
		SimpleDateFormat sf4 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒E");
		System.out.println(sf4.format(now));
		SimpleDateFormat sf5 = new SimpleDateFormat("一年中的第D天，一年中的第w周，一个月中的第W周，一天中的第k时z时区");
		System.out.println(sf5.format(now));
	}
//	simpleDateFormat.parse()方法将字符串转换成日期实例
	public static void getStringToDate() {
		SimpleDateFormat sf6 = new SimpleDateFormat("yyyy-MM-dd");
		Date data = null;
			try {
				data = sf6.parse("2019-08-07");
			}catch(ParseException e) {
				System.out.println("输入的字符串格式不符合要求");
			}
			
			System.out.println(data);
		
	}
}
