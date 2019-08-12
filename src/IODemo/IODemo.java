package IODemo;

import java.io.File;

public class IODemo {
	
	public static void main(String[] agrs) {
		File file = new File("./data.txt");
		System.out.println("文件名："+file.getName());
		System.out.println("文件绝对路径："+file.getPath());
		System.out.println("文件上级目录："+file.getParent());
	}

}
