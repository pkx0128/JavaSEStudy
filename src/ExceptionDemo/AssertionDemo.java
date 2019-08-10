package ExceptionDemo;

public class AssertionDemo {
	private int a;
	private int b;
	private int c;
	public AssertionDemo(int a,int b,int c) {
		assert(a+b<c):"不满足三角形三边条件";
		assert(a+c<b):"不满足三角形三边条件";
		assert(b+c<a):"不满足三角形三边条件";
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
