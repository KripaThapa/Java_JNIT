import java.io.*;
class BufferedDemo{
public static void main(String args[]) throws IOException, FileNotFoundException{
FileOutputStream ft = new FileOutputStream("example.txt");
BufferedOutputStream bt = new BufferedOutputStream(ft);
String s = "Welcome to java world";

byte b[]=s.getBytes();
bt.write(b);
bt.flush();



}

}