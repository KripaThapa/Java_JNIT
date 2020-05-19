import java.io.*;
class FileOutput{
  public static void main(String args[]) throws IOException, FileNotFoundException{
     FileOutputStream ft = new FileOutputStream("example.txt");
     String s = "Welcone to java files concept, Thank you";
     byte b[]=s.getBytes();
     ft.write(b);
     System.out.println("Successfully file created");
}
}