import java.util.*;

class Mammals{
	String b = "Mammals";
	void mamma(){
	      System.out.println("Topic : " + b);
	}

}

class Animals extends Mammals{
	String a = "animals";
	void animal(){
	     System.out.println("Some " + a +" are " + b);

	}

}

class Tigers extends Animals{
	void aTiger()
	{
	       System.out.println("Tigers are " + a + " that are categorize in  " + b);
	}

}

class DemoMulti{
         public static void main(String args[]){
	Tigers t = new Tigers();
	t.mamma();
	t.animal();
	t.aTiger();

        }

}