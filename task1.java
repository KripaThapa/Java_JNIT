class Operators{
        public static void main(String args[])
        {
	int a, c;
	a = c = 20;
	float b = 5.5f;
	int d = 2;
	
	c += 2;
	
	System.out.println("The value of a is " + a);
	System.out.println("The value of b is " + (int)(b));
	System.out.println("The value of c is " + c);
	System.out.println("The value of d is " + d*2);
	System.out.println();

	if(a <= c)
	{
	        int inc;
	        inc = d++;
	        System.out.println(inc);
	}
        }



}