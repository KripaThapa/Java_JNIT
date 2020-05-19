import java.io.*;
import java.util.Scanner;

class Student implements Serializable{
  int id;
  String name;
  String major;
  public Student(int id, String name,String major)
 {
     this.id = id;
     this.name = name;
     this.major=major;
  }

}

class SerializableDemo{
   public static void main(String args[]) throws Exception{
       Student kripa = new Student(1001, "Kripa", "CS");
       FileOutputStream ft = new FileOutputStream("info.txt");
       ObjectOutputStream ot=new ObjectOutputStream(ft);
       ot.writeObject(kripa);
       ot.close();
       System.out.println("Created");
  }

}