
class ExceptionHandlingDemo{
     public static void main(String args[]){
          int a = 10; 
          int b=0;

         System.out.println("sum = " + (a + b));
         try
         {
	System.out.println("Divison = " + (a/b));
	
         }
          catch(ArithmeticException e)
         {
	e.printStackTrace();
          }
          System.out.println("multiplication = " + (a*b));
          System.out.println("substraction = " + (a - b));


    }


}