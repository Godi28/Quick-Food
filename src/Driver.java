// importing packages for the code
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// public driver class that hold the driverSelection method
public class Driver {
  // public driverSelection method that matches closest driver with least load to customer 
  public static String driverSelection(String customerLocation) {  
	 // creating empty driver string variable
	 String driver = "";
	  
    try {	 
		    // getting the drivers.txt file from directory 
			File drivers = new File("C:\\Users\\Godi\\Dropbox\\Godi Sehoole-104282\\"
			    + "2. Advanced Programming Concepts\\Task 7\\drivers.txt");
			// creating new scanner in order to read it
			Scanner scanner2 = new Scanner(drivers);
			
	  // condition to read the all lines of the txt file
	  while (scanner2.hasNext()) {
			  // reading all lines of the txt file	
		      String driverList = scanner2.nextLine();
		      /* creating new string array that splits the different drivers and their unique information lines
		       * at the comma (,) in the txt file into array containing 3 values.*/
		      String[] driverArray = driverList.split(",");
		      
		// statement to choose least loaded driver if the customer location is Cape Town 
	    if (driverArray[1].contains(customerLocation)&&customerLocation.contentEquals("Cape Town")
	        &&driverArray[2].contains("1")) {
				 // appending driver name into driver empty driver variable  
		    	 driver+= "Miranda Metcalfe";
			
		} 
	    
		// statement to choose least loaded driver if the customer location is Johannesburg 
		else if (driverArray[1].contains(customerLocation)&&customerLocation.contentEquals("Johannesburg")
		    &&!driverArray[2].contains("10")&&!driverArray[2].contains("12")&&!driverArray[2].contains("14")) {
				 // appending driver name into driver empty driver variable 
				 driver+= "Spike Fenton";
		} 
	    
		// statement to choose least loaded driver if the customer location is Port Elizabeth 
		else if (driverArray[1].contains(customerLocation)&&customerLocation.contentEquals("Port Elizabeth")
			&&driverArray[2].contains("1")) {
				 // appending driver name into driver empty driver variable 
				 driver+= "Ana Ortega";
		} 
	    
		// statement to choose least loaded driver if the customer location is Potchefstroom 
		else if (driverArray[1].contains(customerLocation)&&customerLocation.contentEquals("Potchefstroom")
			&&driverArray[2].contains("3")) {
				 // appending driver name into driver empty driver variable 
				 driver+= "Jaidan Spencer";
			
		} 
	    
		// statement to choose least loaded driver if the customer location is Witbank
		else if (driverArray[1].contains(customerLocation)&&customerLocation.contentEquals("Witbank")
			&&driverArray[2].contains("4")) {
				 // appending driver name into driver empty driver variable 
				 driver+= "Eshan Gibson";
		}
	    
		// statement to choose least loaded driver if the customer location is Springbok
		else if (driverArray[1].contains(customerLocation)&&customerLocation.contentEquals("Springbok")
			&&driverArray[2].contains("1")&&!driverArray[2].contains("11")) {
				 // appending driver name into driver empty driver variable 
				 driver+= "Johan Hoffman";
		}
	    
		// statement to choose least loaded driver if the customer location is Bloemfontein
		else if (driverArray[1].contains(customerLocation)&&customerLocation.contentEquals("Bloemfontein")
			&&driverArray[2].contains("6")&&!driverArray[2].contains("16")) {
				 // appending driver name into driver empty driver variable 
				 driver+= "Kailan Snow";
		}
	    
		// statement to choose least loaded driver if the customer location is Durban
	    else if (driverArray[1].contains(customerLocation)&&customerLocation.contentEquals("Durban")
	    	&&driverArray[2].contains("2")&&!driverArray[2].contains("12")) {
				 // appending driver name into driver empty driver variable  
				 driver+= "Eugene Santana";
        }
		    
      }    
			
			 // printing out selected driver
			 System.out.println("\n"+"Delivery Driver"+"\n" +"Driver:"+driver);
			 // closing scanner
			 scanner2.close();
			 
	}
	  
	// printing out error message if 'try' fails
    catch (FileNotFoundException e) {
    	
			    System.out.println("Error");
    }
	  
	// setting driver string as the return value  
	return driver;
	
  }
  
}