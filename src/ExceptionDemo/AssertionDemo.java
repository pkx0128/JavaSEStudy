package ExceptionDemo;

public class AssertionDemo {
	private int a;
	private int b;
	private int c;
	public AssertionDemo(int a,int b,int c) {
		assert(a+b<c);
		assert(a+c<b);
		assert(b+c<a);
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
