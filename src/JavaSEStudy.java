import java.util.Arrays;
public class JavaSEStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义整型数组 num
		int[] num = {3,4,2,6,9,1};
		//调用Arrays.sort()方法对数组num元素进行排序
		Arrays.sort(num);
		//遍历数组元素
		for(int i:num) {	
			System.out.println(i);
		}
	}

}
