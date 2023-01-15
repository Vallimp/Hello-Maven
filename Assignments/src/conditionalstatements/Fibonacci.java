package conditionalstatements;

import java.util.Scanner;

public class Fibonacci {

   public void Fibonacciseries(int n) {
    	
        int firstnumber = 0; 
        int Secondnumber = 1;
  
        int series = 0;
  
        // Count till n
        while (series < n) {
  
            System.out.print(firstnumber + " ");
  
            // Swap
            int Thirdnumber = Secondnumber + firstnumber;
            firstnumber = Secondnumber;
            Secondnumber = Thirdnumber;
            series = series + 1;
        }
    }

    public static void main(String args[])
    {
    	Fibonacci sc = new Fibonacci();
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the last number until which you want to print fibonaci series");
		
		 int n = s1.nextInt();
        
        sc.Fibonacciseries(n);
    }
}
