package conditionalstatements;

import java.util.Scanner;

public class NumberConversions {

	public static void toBinary(int decimal){    
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2; 
	       
	       decimal = decimal/2;    
	     }    
		System.out.println("Binary version of the decimal is");

	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	System.out.println();
	}
	
	public static void toOctal(int decimal){    
	     int Octalnum[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       Octalnum[index++] = decimal%8; 
	       
	       decimal = decimal/8;    
	     }    
		System.out.println("Octal version of the decimal is");

	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(Octalnum[i]);    
	     }    
	System.out.println();
	}
	
	public static void toHexadecimal(int decimal){    
	     int Hexadecimalnum[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	    	 Hexadecimalnum[index++] = decimal%16; 
	       
	       decimal = decimal/16;    
	     }    
			System.out.println("Hexadecimal version of the decimal is");

	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(Hexadecimalnum[i]);    
	     }    
	System.out.println();
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the decimal number you want to convert");
		int num =sc.nextInt();
		
		toBinary(num);
		toOctal(num);
		toHexadecimal(num);
	}  
}

