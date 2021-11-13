// importing package for the code
import java.util.Scanner;

// public main class that holds the main method
public class Main {
  /* public main method passes all Customer,Restaurant,Meal class attributes to their constructors, calls meal selection method,
   * calls driver selection and invoice methods,
   * calls the respective toString methods to print respective attributes*/
   public static void main(String args[]) {
     // creating new scanner to access user inputs
	 Scanner scanner1 = new Scanner(System.in);
		
	  System.out.print("Please enter customer name");
	  // reading customer name input as string and storing in variable
	  String customerName = scanner1.nextLine();
		 
	  System.out.print("Please enter customer contact number");
	  // reading customer contact input and storing in variable
	  String customerContact = scanner1.nextLine(); 
		 			
	  System.out.print("Please enter customer location/city");
	  // reading customer location input as string and storing in variable
	  String customerLocation = scanner1.nextLine(); 
		
	  System.out.print("Please enter customer address");
	  // reading customer address input as string and storing in variable
	  String customerAddress = scanner1.nextLine();
		 
	  System.out.print("Please enter customer email");
	  // reading customer email input as string and storing in variable
	  String customerEmail = scanner1.nextLine();
		
      // creating new Customer instance for constructor and passing relevant argument to it
      Customer customer =  new Customer(customerAddress,customerEmail,customerName,customerContact,customerLocation);
      
      System.out.print("Please enter restaurant name");
	  // reading restaurant name input and storing in variable
	  String restaurantName = scanner1.nextLine();
		 		 
	  System.out.print("Please enter restaurant contact number");
	  // reading restaurant contact input and storing in variable
	  String restaurantContact = scanner1.nextLine();
		 		 
	  System.out.print("Please enter restaurant location/city");
	  // reading restaurant location input and storing in variable
	  String restaurantLocation = scanner1.nextLine();
        
      // creating new Restaurant instance for constructor and passing relevant argument to it
	  Restaurant restaurant = new Restaurant(restaurantName,restaurantContact,restaurantLocation);

	  // calling customerMealSelection method and storing method return into a string variable
	  String customerMealSection = Meal.MealSelection();
		
	  System.out.print("Please enter total price to be paid");
	  // reading customer meal order total price input and storing in variable
	  String customerMealOrderTotalPrice = scanner1.nextLine();
		 
	  System.out.print("Please enter customer meal special prepation instructions");
	  // reading customer meal preparations input and storing in variable
	  String customerMealPreparations = scanner1.nextLine();
		 	 
	  System.out.print("Please enter customer order number ");
	  // reading customer order number input as string and storing in variable
	  String customerMealOrderNumber = scanner1.nextLine();
		 
	  // creating new Restaurant instance for constructor and passing relevant argument to it
	  Meal meal = new Meal(customerMealPreparations,customerMealOrderNumber,customerMealOrderTotalPrice);
				 
	 /* 77-83 calling toString methods
	 and printing out previously set attributes also printing out customerMealSelection
	 and customerMealOrderTotalPrice individually*/
	 System.out.println("\nRestaurant");
	 System.out.println(restaurant.toString()+ "\n");
	 System.out.println("Customer");
	 System.out.println(customer.toString());
	 System.out.println("\nCustomer Meal Selection"+ "\n" + customerMealSection);
	 System.out.println("Customer Total Price:"+ meal.customerMealOrderTotalPrice);
	 System.out.println(meal.toString());
	     
	 // calling driverSelection method and storing method return into a string
	 String driver = Driver.driverSelection(customerLocation);
	     
	 // calling invoice method with appropriate arguments
	 Invoice.invoice(customer,meal, restaurant, customerMealSection,driver);
	     
	 //closing scanner 
	 scanner1.close();
  }     
	
}

