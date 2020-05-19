import java.sql.*;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password="123";
		Connection conn = DriverManager.getConnection(url, username, password);
		 
		if(conn!=null)
		{
			System.out.println("Connected");
		}
		
	}
	

}
