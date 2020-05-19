package mySql;
import java.sql.*;

class DeleteDemo{
public static void main(String args[]) throws Throwable{
Class.forName("com.mysql.cj.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/employee";
      String username = "root";
      String password = "band12.6";
      Connection con=DriverManager.getConnection(url, username, password);
      
      if(con != null)
        System.out.println("Connected");
      
      Statement s = con.createStatement();
      int deleteData = s.executeUpdate("delete from employee where id=1000");
      if(deleteData!=0)
          System.out.println("Succesfully deleted");
      
      
}
}