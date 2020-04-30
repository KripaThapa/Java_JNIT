class Dealers{
	int honda = 15000;
	int toyota = 11000;
	int ford = 9000;
	int hyundai = 5000;
          void cars()
          {
	System.out.println("The available cars in our place are: Honda, Toyota, Ford, Hyundai");
           }
          

          String price()
          {
	System.out.println("Prices are: Honda = " + honda );
	System.out.println("Prices are: toyota= " + toyota);
	System.out.println("Prices are: ford= " + ford);
	System.out.println("Prices are: hyundai= " + hyundai);
	return "Our prices are the best in our state";
          }

          String clientName(String firstName, String secondName)
          {
	return "Welcome " + firstName + secondName;
          }

         void buy(String car)
          {
	System.out.println("Thank you for buying " + car);
          }
          

}

class Client{
         public static void main(String args[]){
	Dealers family = new Dealers();
	family.cars();
	System.out.println(family.price());
	System.out.println(family.clientName("Kripa ", "Thapa"));
                family.buy("Toyata");
               

         }

}