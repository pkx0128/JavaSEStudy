package StringClass;

public class StringClassDemo {

	public static void main(String[] agrs) {
//		默认构造函数创建String对象
		String s1 = new String();
		System.out.println("s1的值为："+s1);
		
//		参数为字符数组的构造函数
		char[] c = {'a','s','v'};
		String s2 = new String(c);
		System.out.println("s2的值为："+s2);
//		参数为字符对象的构造函数
		String s3 = new String(s2);
		System.out.println("s3的值为："+s3);
		
//		获取字符串的长度
		int stringLength = s3.length();
		System.out.println("字符串s3的长度为："+stringLength);
		
//		字符串常量实现String对象
		String s4 = "这是一个字符串对象";
		System.out.println("s4的长度"+s4.length());
		
	}
}
