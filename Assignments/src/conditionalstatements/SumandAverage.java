package conditionalstatements;

import java.util.Scanner;

public class SumandAverage {

	int Sum;
	float Average;

	public SumandAverage(int sub1, int sub2, int sub3, int sub4) {
		Sum=sub1+sub2+sub3+sub4;
		Average = Sum/4;
		
		System.out.println("Total marks of the student are " +Sum);
		System.out.println("Average marks of the student are " +Average);
	}
	public SumandAverage(int sub1, int sub2, int sub3) {
		Sum=sub1+sub2+sub3+35;
		Average = Sum/4;
		System.out.println("Total marks of the student are " +Sum);
		System.out.println("Average marks of the student are " +Average);
	}
	public SumandAverage(int sub1, int sub2) {
		Sum=sub1+sub2+35+35;
		Average = Sum/4;
		System.out.println("Total marks of the student are " +Sum);
		System.out.println("Average marks of the student are " +Average);
	}
	public SumandAverage(int sub1) {
		Sum=sub1+35+35+35;
		Average = Sum/4;
		System.out.println("Total marks of the student are " +Sum);
		System.out.println("Average marks of the student are " +Average);
	}
	
	public static void main(String[] args)
	{		
		Scanner sc= new Scanner(System.in);
		
		int Examsattended;
		int submark[];
		submark= new int[20];
		
		System.out.println("Enter the number of exams attended between 1 to 4");
		Examsattended = sc.nextInt();
		
		for(int i=1; i<= Examsattended; i++)
		{
			System.out.println("Enter the marks in Subject"+ i);
			submark[i]=sc.nextInt();
		}
		switch(Examsattended)
		{
		case 4: SumandAverage obj1 = new SumandAverage(submark[1],submark[2],submark[3],submark[4]);
				break;
		case 3: SumandAverage obj2 = new SumandAverage(submark[1],submark[2],submark[3]);
				break;
		case 2: SumandAverage obj3 = new SumandAverage(submark[1],submark[2]);
				break;
		case 1: SumandAverage obj4 = new SumandAverage(submark[1]);
				break;
		}
	}
	
}