package MysqlJDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//封装数据库连接
public class MysqlConn {
	
	private Properties pros;
	private String url;
	private String username;
	private String password;
	
	public MysqlConn(String configFileName) throws FileNotFoundException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		pros = new Properties();
		pros.load(new FileInputStream(configFileName));
		url = pros.getProperty("url");
		username = pros.getProperty("username");
		password = pros.getProperty("password");
		Class.forName(pros.getProperty("driverName")).newInstance();
	}
//	获取连接对象
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}
//	关闭连接对象
	public void closeConnection(Connection conn) throws SQLException{
		conn.close();
	}

}
