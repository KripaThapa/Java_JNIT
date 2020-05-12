interface Electronic{
void price();
void ram();
void weight();
}

abstract class Mac implements Electronic{
void graphicProcessor(){
       System.out.println("Graphic Processor: Intel Iris Plus Graphics");
}

void processor(){
      System.out.println("Processor: Intel Core i5-1030NG7");
}

}

class MacbookAir extends Mac{
public void price(){
       System.out.println("Price: $999");
}

public void ram(){
       System.out.println("Ram: 8GB");
}

public void weight(){
       System.out.println("Weight: 2.8 lbs");
}
}

class MacbookPro extends Mac{
public void price(){
       System.out.println("Price: $1,299");
}

public void ram(){
       System.out.println("Ram: 16GB");
}

public void weight(){
       System.out.println("Weight: 3.1 lbs");
}
}

class Test{
public static void main(String args[]){
      Mac macbook;
      System.out.println("MacBook Air");
      macbook = new MacbookAir();
      macbook.price();
      macbook.ram();
      macbook.weight();
      macbook.graphicProcessor();
      macbook.processor();
       System.out.println();
       System.out.println("MacBook Pro");
      macbook = new MacbookPro();
      macbook.price();
      macbook.ram();
      macbook.weight();
      macbook.graphicProcessor();
      macbook.processor();
       

}

}