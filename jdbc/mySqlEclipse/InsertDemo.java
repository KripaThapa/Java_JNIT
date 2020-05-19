package mySql;
import java.sql.*;

class InsertDemo{
public static void main(String args[]) throws Throwable{
Class.forName("com.mysql.cj.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/employee";
      String username = "root";
      String password = "band12.6";
      Connection con=DriverManager.getConnection(url, username, password);
      
      if(con != null)
        System.out.println("Connected");
      
      Statement s = con.createStatement();
      int insertData = s.executeUpdate("insert into employee values(1000, 'Kripa Thapa', 'IT', 5000)");
      
      if(insertData!=0)
          System.out.println("Succesfully inserted");
      
      
}
}