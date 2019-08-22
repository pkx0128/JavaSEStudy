package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class JDBCDemo {
	
	public static void main(String args[]) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost/my_db", "root", "Pankx0128");
			String sql = "select * from Persons";
			PreparedStatement ps = cnn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt("PersonID")+res.getString("FirstName")+res.getString("LastName")+res.getInt("Age"));
			}
			cnn.close();
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
