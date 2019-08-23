package MysqlJDBC;

import java.sql.DriverManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DelData {
	public static void getDelDataMethod() {
		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/spdb","root","Pankx0128");
			MysqlConn mc = new MysqlConn("my.properties");
			Connection con = mc.getConnection();
			String sql = "DELETE FROM users WHERE userId=?;";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 2);
			ps.execute();
			con.close();
			System.out.println("删除成功");
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
