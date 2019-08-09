package PolymorphismDemo;
//立方体容器类
public class Cube extends Tank {
	
	private Double length;
	
	public Cube(Double length) {
		this.length = length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	//计算立方体的体积
	public Double getVolumn() {
		return Math.pow(length, 3);
	}
}
