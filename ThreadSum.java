import java.util.Scanner;

class ThreadSum extends Thread{
int x;
int y;
public void run()
{
System.out.println("Enter two values: ");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
}

public static void main(String args[]) throws Exception
{ 
    ThreadSum t = new ThreadSum ();
    System.out.println("Before starting is Thread alive: " + t.isAlive());
    t.start();
    t.join();
    int c=t.x+ t.y;
    System.out.println("Sum: " + c);
     

}
}