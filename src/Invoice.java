// importing package for the code
import java.io.FileNotFoundException;
import java.util.Formatter;

// public invoice class that holds invoice method
public class Invoice {
  // public invoice method that creates 2 different invoices ,based on conditions ,in a text file.
  public static void invoice(Customer customer,Meal meal,Restaurant restaurant,
      String customerMealSelection,String driver){
		/* referencing string variables from 
	     the respective instances made in the main method and storing them in variables */
	    String customerName = customer.customerName;
		String customerContact = customer.customerContact;
		String customerLocation = customer.customerLocation;
		String customerAddress = customer.customerAddress;
		String customerEmail = customer.customerEmail;
		String customerMealOrderNumber = meal.customerMealOrderNumber;
		String customerMealPreparations = meal.customerMealPreparations;
		String customerMealTotalPrice = meal.customerMealOrderTotalPrice;
		String restaurantLocation = restaurant.restaurantLocation;
		String restaurantName = restaurant.restaurantName;
		String restaurantContact = restaurant.restaurantContact;
		
	  try {
		// statement for when customer location matches driver location
        if (customerLocation.contains("Durban")||customerLocation.contains("Cape Town")||
            customerLocation.contains("Witbank")||customerLocation.contains("Springbok")
        	||customerLocation.contains("Johannesburg")||customerLocation.contains("Port Elizabeth")
        	||customerLocation.contains("Bloemfontein")||customerLocation.contains("Potchefstroom")) {
            	 /* 32-54 creating new invoice.txt file in location specified below,
            	  * that shows all the details of the meal ordering transaction and closing formatter*/
				 Formatter formatter1 = new Formatter("C:\\Users\\Godi\\Dropbox\\Godi Sehoole-104282\\"
				     + "2. Advanced Programming Concepts\\Task 16\\Quick-Food\\invoice.txt");
				 formatter1.format("%s %s %s", "Order", "number", customerMealOrderNumber);
				 formatter1.format("%s %s","\r\nCustomer:", customerName );
				 formatter1.format("%s %s","\r\nEmail:", customerEmail );
				 formatter1.format("%s %s %s","\r\nPhone:","Number", customerContact );
				 formatter1.format("%s %s","\r\nLocation:", customerLocation );
				 formatter1.format("%s %s %s %s %s %s %s %s %s", "\r\n\r\nYou", 
					 "have", "ordered ","the","following","from",restaurantName,"in",restaurantLocation + ":");
				 formatter1.format("%s","\r\n\r\n");
				 formatter1.format(customerMealSelection);
				 formatter1.format("%s %s %s", "\r\n\r\nSpecial", "instructions:", customerMealPreparations);
				 formatter1.format("%s %s", "\r\n\r\nTotal:", customerMealTotalPrice);
				 formatter1.format("%s","\r\n\r\n");
				 formatter1.format("%s %s %s %s %s %s %s %s %s %s %s %s %s %s",driver, "is","the","nearest","to","the",
					 "restaurant","and","so","he","will","be","delevering", "your");
				 formatter1.format("%s","\r\n");
				 formatter1.format("%s %s %s %s","order","to","you","at:");
				 formatter1.format("%s","\r\n\r\n");
				 formatter1.format(customerAddress);
				 formatter1.format("%s %s %s %s %s %s %s %s %s %s %s %s", "\r\n\r\nIf", "you", "need","to","contact",
					 "the","restaurant,","their", "number","is" , restaurantContact,".");
				 formatter1.close();
            	
      }
            
	  // statement for when customer location doesn't match driver location	
	  else  {
	        	 /* 62-67 creating new invoice.txt file in location specified below,
	        	  * that explains to the user that there is no nearby driver in their location and closing formatter*/
				 Formatter formatter2 = new Formatter("C:\\Users\\Godi\\Dropbox\\Godi Sehoole-104282\\"
				     + "2. Advanced Programming Concepts\\Task 11\\invoice.txt");
				 formatter2.format("%s %s %s %s %s %s %s %s %s %s %s %s ","Sorry!", "Our","drivers","are","too","far","away","from","you","to","be","able");
				 formatter2.format("%s","\r\n");
				 formatter2.format("%s %s %s %s %s","to", "deliver","to","your","location.");
				 formatter2.close();
      } 
		    
    }
		
	// printing out error message if 'try' fails
	catch (FileNotFoundException e) {
	        System.out.println("Error");
    }
	
  }  
	
}