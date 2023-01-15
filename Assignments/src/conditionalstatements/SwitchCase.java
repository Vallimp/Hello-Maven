package conditionalstatements;

import java.util.Scanner;

public class SwitchCase {
	
int DayOfTheWeek;

  void Switchcondition() {
	 
switch(DayOfTheWeek) {

case 1 :{
	System.out.println("Sunday");
	break;
}
case 2: {
	System.out.println("Monday");
	break;
}
case 3 :{
	System.out.println("Tuesday");
	break;
}
case 4 :{
	System.out.println("Wednesday");
	break;
}
case 5 :{
	System.out.println("Thursday");
	break;
}
case 6 :{
	System.out.println("Friday");
	break;
}
case 7 :{
	System.out.println("Saturday");
	break;
}
default:
	System.out.println("Invalid weekday");
}
 }
 public static void main(String[] args) {
		
		SwitchCase sc = new SwitchCase();
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number of the weekday");
		 sc.DayOfTheWeek = s1.nextInt();
		
		System.out.println("Name of the weekday is");
	    sc.Switchcondition();
		
 }
 }
