package MysqlJDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryData {

	public static void getQueryDataMethod() {
		
		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/spdb","root","Pankx0128");
			MysqlConn mc = new MysqlConn("my.properties");
			Connection conn = mc.getConnection();
			String sql = "SELECT * FROM users";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				System.out.println("用户ID："+res.getInt("userId")
				+"用户名："+res.getString("username")
				+"密码："+res.getString("passwd")
				+"email："+res.getString("email")
				+"grade:"+res.getInt("grade")
				);
			}
			conn.close();
			System.out.println("查询结束");
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
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
