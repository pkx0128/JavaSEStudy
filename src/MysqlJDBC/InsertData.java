package MysqlJDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertData {
	public static void getInsertMethod() {
		try {
//		加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			获取连接对象
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost/spdb", "root", "Pankx0128");
			String sql = "INSERT INTO users(userId,username,passwd,email,grade)VALUES(?,?,?,?,?);";
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1, 2);
			ps.setString(2, "xiaohong");
			ps.setString(3, "123456");
			ps.setString(4, "xiaohong@qq.com");
			ps.setInt(5, 1);
			ps.execute();
			cnn.close();
			System.out.println("插入成功");
				
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
