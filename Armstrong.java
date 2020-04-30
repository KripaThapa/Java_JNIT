import java.util.Scanner;

class ArmStrong
{
       public static void main(String args[])
       {
	//int n = 123,
	int x=0, rem=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a value: " );
	int n= sc.nextInt();
	while(n>0){
	      rem = n % 10;
	      int r = rem * rem * rem;
	      x = x + r;
	      n = n/10;
	      
	}
	 System.out.println(x);
       }
}