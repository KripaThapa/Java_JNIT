class Display{
public synchronized void wish(String name){
      for(int i=1; i<=5; i++){
          System.out.print("Hello ");
	try{
	     Thread.sleep(500);
	      System.out.println(name);
	}
	catch(Exception e)
	{
	      e.printStackTrace();
	}	
      }

}

}

class MyThread extends Thread{
Display d;
String name;
MyThread(Display d, String name){
this.d=d;
this.name=name;
}
public void run(){
d.wish(name);
}

}

class SyncronizeDemo{
public static void main(String args[])
{
    Display d = new Display();
    MyThread t1=new MyThread(d, "Mindy");
    MyThread t2=new MyThread(d, "Mandy");
    t1.start();
    t2.start();
}

}