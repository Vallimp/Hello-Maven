package studentpackage;

import java.util.Scanner;//importing the java scanner class// 

public class studentmark {

	
	String studentname;
	int sub1, sub2, sub3, sub4, total;
	float average;


	public int calculatetotal(String studentname,int sub1,int sub2,int sub3,int sub4)
	{		
	
		total=sub1+sub2+sub3+sub4;
		return total;
	}
	public float calculateaverage() {
		average=total/4;
		return average;
	}
	
public static void main(String[] args) {
	
	studentmark obj=new studentmark();
	
	Scanner var= new Scanner(System.in);
	int totalscore;
	float averagescore;
	
	for (int studentnumber = 1; studentnumber<=4; studentnumber++) {
	
	System.out.println("Enter Student Name");
	String studentname = var.next();
	
	System.out.println("Enter sub1");
	int sub1 =var.nextInt();
	
	System.out.println("Enter sub2");
	int sub2 =var.nextInt();
	
	System.out.println("Enter sub3");
	int sub3 = var.nextInt();
	
	System.out.println("Enter sub4");
	int sub4 = var.nextInt();

	totalscore=obj.calculatetotal(studentname, sub1, sub2, sub3, sub4);
	averagescore=obj.calculateaverage();

	System.out.println("Total score of the student is:" +totalscore);
	System.out.println("Average score of the student is:" +averagescore);
	}
}
}
