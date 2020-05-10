abstract class Animal{
abstract void lifespan();
void breath(){System.out.println("They breath air");};
}

class Tiger extends Animal{
          void lifespan(){
	System.out.println("Average lifespan of tiger is 10-15yrs");
          }
}

class Mudskipper extends Animal{
         void lifespan(){
	System.out.println("Average lifespan of Mudskipper is 5yrs");
          }
}

class AbstractDemo{
          public static void main(String args[]){
	Animal t;
	t = new Tiger();
	t.lifespan();
	t.breath();

 	t = new Mudskipper();
	t.lifespan();
	t.breath();
          }

}