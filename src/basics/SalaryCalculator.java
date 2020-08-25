package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		
		// declare a variable
		String career;
		System.out.println("Program is starting");
		
		// define a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate  = 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My Salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
	}
}
