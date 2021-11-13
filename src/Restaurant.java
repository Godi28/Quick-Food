/* public class Restaurant that its own attributes, has a Restaurant constructor method and
 *  has method to print its attributes*/
public class Restaurant {
  // declaring restaurantName as a string variable
  String restaurantName;
  // declaring restaurantContact as a string variable
  String restaurantContact;
  // declaring restaurantContact as a string variable
  String restaurantLocation;

  // public Restaurant constructor method to set Restaurant class attributes
  public Restaurant( String restaurantName, String restaurantContact, String restaurantLocation) {
	  
    this.restaurantName = restaurantName;
	this.restaurantContact = restaurantContact;
	this.restaurantLocation = restaurantLocation;
		
  }

  // public toString method to print all the Restaurant class attributes
  public String toString() {
	  
    String output = "Restaurant Name: " + restaurantName;
    output += "\nRestaurant Contact:" + restaurantContact;
    output += "\nRestaurant Location:" + restaurantLocation;
    // setting output string as a return value
    return output;
	
  }
    
}
