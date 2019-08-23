package MysqlJDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DelData {
	public static void getDelDataMethod() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/spdb","root","Pankx0128");
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
		}
	}

}
