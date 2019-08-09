package PolymorphismDemo;

public class Cylinder extends Tank {
	
	private Double r;
	private Double height;
	
	public Cylinder(Double r,Double height) {
		this.r = r;
		this.height = height;
	}
	
	public void setR(Double r) {
		this.r = r;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double getR() {
		return r;
	}
	
	public Double getHeight() {
		return height;
	}
	
	
	public Double getVolumn() {
		return Math.PI * r * r * height;
	}
}
