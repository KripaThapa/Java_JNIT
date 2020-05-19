import java.io.*;

class DeserializableDemo{
   public static void main(String args[]) throws Exception{
       FileInputStream ft = new FileInputStream("info.txt");
       ObjectInputStream in=new ObjectInputStream(ft);
       Object o = in.readObject();
        Student kripa = (Student)o;
        System.out.println(kripa.name);
        System.out.println(kripa.id);
        System.out.println(kripa.major);
 
  }

}