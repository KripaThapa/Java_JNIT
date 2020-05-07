abstract class Animal{
abstract void lifespan();
abstract void breath();
}

class Tiger extends Animal{
          void lifespan(){
	System.out.println("Average lifespan of tiger is 10-15yrs");
          }

          void breath(){
	System.out.println("Tiger breath air through their nose");
          }
}

class Mudskipper extends Animal{
         void lifespan(){
	System.out.println("Average lifespan of Mudskipper is 5yrs");
          }

          void breath(){
	System.out.println("Mudskippers breath air through their nose as well as they can get oxygen through their skin");
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