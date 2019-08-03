/**
 * 二维数组的创建与遍历
 * @author pankx
 *
 */
public class ArrayDemo {
	static String[][] cars = {{"BMW","Benz","Audi"},{"Buick","Porsche"},{"Honda","Nissan"}};

	public static void  outCars() {
//		System.out.println(cars[0][1]);
		for(int i=0;i<cars.length;i++) {
			for(int j=0;j<cars[i].length;j++) {
				System.out.println("cars["+i+"]["+j+"]="+cars[i][j]);
			}
		}
	}
}
