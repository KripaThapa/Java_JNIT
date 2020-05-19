import java.sql.*;

class DatabaseUpdate{
public static void main(String args[]) throws Throwable{
     Class.forName("com.mysql.cj.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/student";
      String username = "root";
      String password = "band12.6";
      Connection con=DriverManager.getConnection(url, username, password);
      
      if(con != null)
        System.out.println("Connected");
      
      Statement st=con.createStatement();

     int updateData = st.executeUpdate("update student set major="Medical"where id=1005");
      
      if(updateData!=0)
         System.out.println("Succesfully updated");
}
}