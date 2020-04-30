class Operators{
          public static void main(String args[]){
	int a, b, c = 0, d, e;
	float x;
	x = 1.5f;

	// chained assignment operators
	a = b = c = 20;
	
	//simple assignment operators
	d = 5;
	
	//compound assignment operators
	 c += 5;

	 e = b++;
	
	System.out.println("Pre-increment of a "+ a + "  is" + (++a));
	System.out.println("Post-increment of b " + b + " is " + e);
	System.out.println("Changing the float value " + x + " to integer(Explicit) " + (int)(x));

	//Bitwise 
	boolean y = true;
	boolean z = false;
	boolean and = y & z;
	boolean or = y | z;
	boolean xor = y ^ z;
	System.out.println("Bitwise ");
	System.out.println("y = " + y + "    z= " + z);
	System.out.println("AND (y & z) = " + and);
	System.out.println("OR (y | z) =  " + or);
	System.out.println("XOR (y ^ z)= "+ xor);

	int addition=0, substraction=10, division=20;

	addition += a;
	substraction -= d;
	division /= c;
	System.out.println("Compound Assignment");
	System.out.println("addition = " + addition );
	System.out.println("Substraction = " + substraction);
	System.out.println("Division = "  + division );

	
          }


}