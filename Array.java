import java.util.Scanner;
public class Array{
           public static void main(String args[]){
	int a[][];
	int sum = 0;
	int rows = 2;
	int cols = 2;
	a = new int[rows][cols];

	for(int i=0; i<rows;i++){
	      for(int j=0; j <cols;j++){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a[i][j] = sc.nextInt();
		}
	}

	for(int i=0; i<rows;i++){
	      for(int j=0; j <cols;j++){
		sum += a[i][j];
		System.out.println("a[" + i + "][" + j + "] =" + a[i][j]);
		}	
	}
	System.out.println("Sum: " + sum);
           }

}