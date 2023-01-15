package conditionalstatements;

import java.util.Scanner;

public class Factors {
	
	 	int number;
	 	
	 	public void FactorsOfaNumber() {
	 		
		    System.out.print("Factors of the number are: ");
	    	  int count=0;

	 		for (int i = 1; i <= number; ++i) {

	      if (number % i == 0) {
	    	  count=count+1;
	    	  	    	  
	        System.out.println(i + " ");
	        
	      	}
	      }
		      System.out.println("Number of factors for the nuumber is  " + count);
	 	}

	public static void main(String[] args) {

		Factors obj = new Factors();
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number");
		obj.number = s1.nextInt();
		 
		 obj.FactorsOfaNumber();
		 
	    }
	  }

