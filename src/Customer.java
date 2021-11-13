/* public class Customer has attributes,
 * their constructor method and a toString method*/
public class Customer {		
  // declaring customerAddress as string variable
  String customerAddress;
  // declaring customerEmail as string variable
  String customerEmail;
  // declaring customerName as a string variable
  String customerName;
  // declaring customerContact as a string variable
  String customerContact;
  // declaring customerLocation as a string variable
  String customerLocation;
		
  // public Customer constructor method to set Customer class attributes
  public Customer(String customerAddress,String customerEmail, String customerName,
      String customerContact, String customerLocation) {
	  
    this.customerAddress = customerAddress;
	this.customerEmail = customerEmail;
	this.customerName = customerName;
	this.customerContact = customerContact;
	this.customerLocation = customerLocation;
		
  }
		
  // public toString method to print all of Customer class attributes
  public String toString() {
	  
	String output = "Customer Name: " + customerName;
    output += "\nCustomer Contact:" + customerContact;
	output += "\nCustomer Location:" + customerLocation;
	output += "\nCustomer Address:" + customerAddress;
	output += "\nCustomer Email:" + customerEmail;
	// setting output string as a return value
	return output;
		
  }

}
