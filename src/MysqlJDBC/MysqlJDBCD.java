package MysqlJDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MysqlJDBCD {

	public static void main(String[] args) {
//		添加数据到数据库
		InsertData.getInsertMethod();
//		删除指userId的数据
		DelData.getDelDataMethod();
//		查询数据数据
		QueryData.getQueryDataMethod();
		

	}

}
