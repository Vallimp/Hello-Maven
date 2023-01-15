package employeesalary;
import java.util.Scanner;

public class empsal {
	
String employeename;
int employeelevel;
double empbasic;
float empBoa;
double monthlytax;
double Provfund;
double empbonus;
double empsalary;
double monthlytakehome;
double yearlygrosssalary;
double yearlytax;


		public double CalcEmpBasicSal() {
			if(employeelevel==1){
				empbasic=7000;
}
			else if(employeelevel==2){
				empbasic=10000;
	}
			else if(employeelevel==3){
				empbasic=12000;
}
			else if(employeelevel==4){
				empbasic=15000;
}
			return empbasic;
		}
		
		public double CalcProvfund() {
			Provfund=empbasic*0.12;
			return Provfund;
}
		public double CalcEmpBoa() {
			if(employeelevel==1){
				empBoa=5000;
}
			else if(employeelevel==2){
				empBoa=7000;
	}
			else if(employeelevel==3){
				empBoa=9000;
}
			else if(employeelevel==4){
				empBoa=10000;
}
			return empbasic;
		}

		public double CalcEmpbonus() {
			if(employeelevel==1){
				empbonus=2000;
}
			else if(employeelevel==2){
				empbonus=2500;
	}
			else if(employeelevel==3){
				empbonus=3000;
}
			else if(employeelevel==4){
				empbonus=3500;
}
			return empbonus;
}
		
		public double CalcyearlyTaxdeduction() {
			
			if(yearlygrosssalary<=250000) {
				yearlytax=0;
			}
				else if(yearlygrosssalary>=250000&&yearlygrosssalary<=500000) {
					yearlytax=0.05*yearlygrosssalary;
				}
				else if(yearlygrosssalary>=500000&&yearlygrosssalary<=750000) {
					yearlytax=0.10*yearlygrosssalary;
			}
				else if(yearlygrosssalary>=750000&&yearlygrosssalary<=1000000) {
					yearlytax=0.15*yearlygrosssalary;
				}
				else if(yearlygrosssalary>=1000000&&yearlygrosssalary<=1250000) {
					yearlytax=0.20*yearlygrosssalary;
				}
				else if(yearlygrosssalary>=1250000&&yearlygrosssalary<=1500000) {
					yearlytax=0.25*yearlygrosssalary;
				}
				else if(yearlygrosssalary>=1500000) {
					yearlytax=0.30*yearlygrosssalary;
				}
			return yearlytax;
		}
		
		public double Calcmonthlytax() {
			monthlytax=yearlytax/12;
			return monthlytax;
		}

		public double Calcempsalary() {
			empsalary=(empbasic+empBoa+empbonus)-Provfund;
			return empsalary;
		}
		
		public double Calcmonthlytakehome() {
			monthlytakehome=empsalary-monthlytax;
			return monthlytakehome;
		}
		
		public double Calcannualtax() {
			yearlytax=monthlytax*12;
			return yearlytax;
		}

		public double Calcempgrosssalary() {
			yearlygrosssalary=empsalary*12;
			return yearlygrosssalary;
		}
		
	public static void main(String[] args) {
		
	empsal emp1=new empsal();
	Scanner scan1=new Scanner(System.in);
	
	System.out.println("Enter employeename");
	emp1.employeename = scan1.next();

	System.out.println("Enter employee level");
	emp1.employeelevel =scan1.nextInt();

	emp1.CalcEmpBasicSal();
	System.out.println("Employee Basic salary is " +emp1.empbasic);
		
	emp1.CalcEmpBoa();
	System.out.println("Employee BOA is  " +emp1.empBoa);
	
	emp1.CalcEmpbonus();
	System.out.println("Employee Bonus is  " +emp1.empbonus);
	
	
	emp1.CalcProvfund();
	System.out.println("Provident fund deducted per month is "+emp1.Provfund);
	
    emp1.Calcempsalary();
	System.out.println("Employee monthly salary is "  +emp1.empsalary);
    
    emp1.Calcempgrosssalary();
	System.out.println("Employee gross salary is " +emp1.yearlygrosssalary);
    
    emp1.CalcyearlyTaxdeduction();
	System.out.println("Yearly tax deduction of the employee is "  +emp1.yearlytax);
	
	emp1.Calcmonthlytax();	
	System.out.println("Monthly tax deducted " +emp1.monthlytax);

	emp1.Calcmonthlytakehome();
	System.out.println("Monthly take home salary of the employee is " +emp1.monthlytakehome);
	
	
	scan1.close();
}

}


