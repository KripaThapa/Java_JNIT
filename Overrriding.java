class Fruits{  
         void name(){
	System.out.println("Topic: Fruits" );
         }
         void color(){
	System.out.println("Color and name: ");
}
}

class Apple extends Fruits{
         void name(){
	System.out.println("Name: Apple ");
}

         void color(){
	System.out.println("Color:  red");
}

}

class Banana extends Fruits{
         void name(){
	System.out.println("Name: Banana ");
}

         void color(){
	System.out.println("Color: Yellow");
}

}

class Overrriding{
          public static void main(String args[]){
	Fruits f = new Fruits();
	f.name();
	f.color();

	f = new Apple();
	f.name();
	f.color();
	
	f = new Banana();
	f.name();
	f.color();



}

}