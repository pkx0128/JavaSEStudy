package PolymorphismDemo;

public class PolymorphismDemo {
	
	public static void main(String[] agrs) {
		Cube cube = new Cube(12.0);
		System.out.println("cube的体积为："+Comp.getTankVolumn(cube));
		Cylinder cylinder = new Cylinder(5.0,10.0);
		System.out.println("cylinder的体积为"+Comp.getTankVolumn(cylinder));
	}
}
