package MysqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlJDBCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//		加载驱动
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost/spdb";
//			获取链接
			Connection cnn = DriverManager.getConnection(url, "root", "Pankx0128");
			
//			向数据库插入数据
			String sql = "INSERT INTO users(userId,username,passwd,email,grade)VALUES(?,?,?,?,?);";
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1, 001);
			ps.setString(2, "xiaoming");
			ps.setString(3, "123456");
			ps.setString(4, "123456@qq.com");
			ps.setInt(5, 1);
			ps.execute();
			cnn.close();
			System.out.println("数据插入成功");
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
