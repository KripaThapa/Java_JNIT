import java.sql.*;
import java.util.Scanner;

class DatabaseInsert{
public static void main(String args[]) throws Throwable{
     Class.forName("com.mysql.cj.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/student";
      String username = "root";
      String password = "band12.6";
      Connection con=DriverManager.getConnection(url, username, password);
      
      if(con != null)
        System.out.println("Connected");
      
      Statement st=con.createStatement();
      Scanner sc = new Scanner(System.in);

      System.out.println("How many students records you want to insert: ");
      int num = sc.nextInt();
      int i = 1;
       int insertData=0;
      while(i <= num){
           System.out.println("Enter id number: ");
           int id = sc.nextInt();
           System.out.println("Enter name: ");
           String name = sc.next();
           System.out.println("Enter major: ");
           String major = sc.next();
           insertData = st.executeUpdate("insert into student values("+id+", '"+name+"', '"+major+"')");
           i++;
      }
      if(insertData!=0)
         System.out.println("Succesfully inserted");
}
}