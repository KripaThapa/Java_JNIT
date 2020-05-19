import java.io.*;
class FileHandlingExample{
public static void main(String args[]) throws IOException, FileNotFoundException{
FileOutputStream ft = new FileOutputStream("example.txt");
String s = "Welcone to java files concept, Thank you";
byte b[]=s.getBytes();
ft.write(b);

FileInputStream fi = new FileInputStream("example.txt");
int x = fi.read();
while(x!=-1){
System.out.print((char)x);
x=fi.read();
}
}
}