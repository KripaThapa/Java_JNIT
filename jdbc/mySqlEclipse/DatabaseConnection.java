package mySql;
import java.sql.*;

class DatabaseConnection{
public static void main(String args[]) throws Throwable{
Class.forName("com.mysql.cj.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/student";
      String username = "root";
      String password = "band12.6";
      Connection con=DriverManager.getConnection(url, username, password);
      
      if(con != null)
        System.out.println("Connected");
      
}
}