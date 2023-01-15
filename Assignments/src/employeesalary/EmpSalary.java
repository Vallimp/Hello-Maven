 package employeesalary;

import java.util.Scanner;

public class EmpSalary {
	
	String employeeName;
	int employeeLevel;
	double empBasic;
	double BOA;
	double monthlyTax;
	double provFund;
	double empBonus;
	double empSalary;
	double monthlyTakeHome;
	double yearlyGrossSalary;
	double yearlyTax;

	public double calcProvFund() {
		provFund=empBasic*0.12;
			return provFund;
	}

	public double calcEmpbonus(int employeeLevel) {
		if(employeeLevel==1){
			empBonus=2000;
		}
		else if(employeeLevel==2){
			empBonus=2500;
		}
		else if(employeeLevel==3){
			empBonus=3000;
		}
		else if(employeeLevel==4){
			empBonus=3500;
		}
		return empBonus;
	}
		
	public double calcYearlyTaxDeduction() {
		
		if(yearlyGrossSalary<=250000) {
			yearlyTax=0;
		}
		else if(yearlyGrossSalary>=250000&&yearlyGrossSalary<=500000) {
			yearlyTax=0.05*yearlyGrossSalary;
		}
		else if(yearlyGrossSalary>=500000&&yearlyGrossSalary<=750000) {
			yearlyTax=0.20*yearlyGrossSalary;
		}
		else if(yearlyGrossSalary>=750000&&yearlyGrossSalary<=1000000) {
			yearlyTax=0.20*yearlyGrossSalary;
		}
		else if(yearlyGrossSalary>=1000000&&yearlyGrossSalary<=1250000) {
			yearlyTax=0.30*yearlyGrossSalary;
		}
		else if(yearlyGrossSalary>=1250000&&yearlyGrossSalary<=1500000) {
			yearlyTax=0.20*yearlyGrossSalary;
		}
		else if(yearlyGrossSalary>=1500000) {
			yearlyTax = 0.30*yearlyGrossSalary;
		}
	
		return yearlyTax;
	}
		
	public double calcMonthlyTax() {
		monthlyTax = yearlyTax/12;
		return monthlyTax;
	}

	public double calcEmpSalary() {
		empSalary = (empBasic + BOA + empBonus) - provFund;
		return empSalary;
	}
		
	public double calcMonthlyTakeHome() {
		monthlyTakeHome=empSalary-monthlyTax;
		return monthlyTakeHome;
	}
		
	public double calcAnnualTax() {
		yearlyTax=monthlyTax*12;
		return yearlyTax;
	}

	public double calcEmpGrossSalary() {
		yearlyGrossSalary=empBasic*12;
		return yearlyGrossSalary;
	}
		
	public static void main(String[] args) {
		
		EmpSalary emp1=new EmpSalary();
		Scanner scan1=new Scanner(System.in);
	
		System.out.println("Enter employeename: ");
		emp1.employeeName = scan1.next();
		
		System.out.println("Enter employee level: ");
		emp1.employeeLevel =scan1.nextInt();
		
		System.out.println("Enter employee basic salary: ");
		emp1.empBasic=scan1.nextFloat();
		
		System.out.println("Enter employee basket of allowance: ");
		emp1.BOA=scan1.nextFloat();
		
		emp1.calcEmpSalary();
		System.out.println("Employee monthly salary is " + emp1.empSalary);
	    
	    emp1.calcEmpGrossSalary();
		System.out.println("Employee gross salary is " + emp1.yearlyGrossSalary);

		emp1.calcYearlyTaxDeduction();
//		System.out.println(emp1.yearlyTax);
//		emp1.calcAnnualTax();
		System.out.println("Yearly tax deduction of the employee is "+ emp1.yearlyTax);
		
		emp1.calcMonthlyTax();
		System.out.println("Monthly tax deducted " + emp1.monthlyTax);
		
		emp1.calcMonthlyTakeHome();
		System.out.println("Monthly take home salary of the employee is "+ emp1.monthlyTakeHome);
		
		scan1.close();
	}

}
