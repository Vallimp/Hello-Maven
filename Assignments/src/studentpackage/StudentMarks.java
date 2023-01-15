package studentpackage;

public class StudentMarks {

	static String StudentName;
	static int Subject1;
	static int Subject2;
	static int Subject3;
	static int Subject4;
    int total;
	int Average;
	

	public int totalmarks(int S1,int S2,int S3,int S4) {
		
		total=S1+S2+S3+S4;
		
			return total;	
	}
	
	public float Avgmarks(int total) {
		
		Average=total/4;
		return Average;
	}
	
public static void main(String[]args) {
	
	StudentMarks s1=new StudentMarks(); //create 3 more objects and assign different values//
	int CalculateMarks;
	float Calculateaverage;
	
	s1.StudentName="Valli";
	s1.Subject1=85;
	s1.Subject2=90;
	s1.Subject3=75;
	s1.Subject4=95;
	CalculateMarks=s1.totalmarks(Subject1,Subject2,Subject3,Subject4);
	Calculateaverage=s1.Avgmarks(CalculateMarks);
	System.out.println(StudentName);
	System.out.println("Total marks for the first student is"+ CalculateMarks);
	System.out.println("Average for the first student is"+ Calculateaverage);
	
}	
}
