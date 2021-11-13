import java.util.Scanner;

public class Meal {
  // declaring customerMealPreparions as string variable
  String customerMealPreparations;
  // declaring customerMealOrderNumber as string variable
  String customerMealOrderNumber;
  // declaring customerQuantities as string variable
  String customerMealQuantities;
  // declaring customerMealOrders as string variable
  String customerMealOrders;
  // declaring customerMealPrices as string variable
  String customerMealPrices;
  // declaring customerMealOrderTotalPrice as string variable
  String customerMealOrderTotalPrice;
  // declaring customerMealSelection as string variable
  String customerMealSelection;
	
  // public Meal constructor method to set some of the Meal class attributes
  public Meal( String customerMealPreparations, String customerMealOrderNumber, String customerMealOrderTotalPrice) {
	  
    this.customerMealPreparations = customerMealPreparations;
	this.customerMealOrderNumber = customerMealOrderNumber;
	this.customerMealOrderTotalPrice = customerMealOrderTotalPrice;
		
   }
	
  // public MealSelection method to allow user to enter multiple meals quantities,orders and prices
  public static String MealSelection() {
    // creating new scanner to access user inputs
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number of 'A' characters as the amount of different type"
        + " of meals ordered eg.'AAAA' for 4 different types of meals");
	// reading user input describing how many different types of meals they would like to enter as a string
	String letters = input.nextLine();
	// creating empty string cuseomerMealSelection
	String customerMealSelection = "";
	  // statement for if user wants to enter 1 type of meal
	  if (letters.equals("A")) {
	    System.out.print("Please enter the meal quantity");
		// reading meal quantity input as a string
		String customerMealQuantities = input.nextLine();
		System.out.print("Please enter the meal order");
		// reading meal orders as a string
		String customerMealOrders = input.nextLine();
		System.out.print("Please enter the meal price");
		// reading meal price input as a string
		String customerMealPrices = input.nextLine();
		// appending the above 3 variables into customerMealSection string variable
		customerMealSelection+= customerMealQuantities+ "x" + "\t" +customerMealOrders+ "\t"
		    +"("+ customerMealPrices +")";
			
	  }
		
	  // statement for if user wants more than 1 type of meal
	  else {
	    /* for loop to iterate through user input length that describes the 
	     * amount of different types of meals to be entered*/
		for (int i=0;i<letters.length();i++) {
		  System.out.print("Please enter the meal quantity");
		  // reading meal quantity input as a string
		  String customerMealQuantities = input.nextLine();
		  System.out.print("Please enter the meal order");
		  // reading meal orders as a string
		  String customerMealOrders = input.nextLine();
		  System.out.print("Please enter the meal price");
		  // reading meal price input as a string
		  String customerMealPrices = input.nextLine();
		  // appending the above 3 variables into customerMealSection string variable
		  customerMealSelection+= customerMealQuantities+ "x" + "\t" +customerMealOrders+ 
		      "\t" +"("+ customerMealPrices +")"+"\n";
	
		  }
			
		}
		
    System.out.println("Customer Meal Selection"+ "\n"+customerMealSelection);
	//setting customerMealSelection string as a return value
	return customerMealSelection;
		
  }
	
  // public toString method to print 2 of the Meal class attributes
  public String toString() {
    String output = "Customer Meal Preparations:" + customerMealPreparations;
	output += "\nCustomer Order Number:" + customerMealOrderNumber;
	// setting output string as a return value
	return output;
		
  }
	
}
