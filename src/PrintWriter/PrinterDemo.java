package PrintWriter;

import java.io.PrintWriter;

public class PrinterDemo {
	
	public static void main(String[] agrs) {
		PrintWriter pw = new PrintWriter(System.out,true);
		pw.println("This is a PrintWriter demo!");
	}

}
