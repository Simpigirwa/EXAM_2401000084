package questionTwo;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee ID:");

		int empId=scanner.nextInt();

		System.out.println("Enter Employee First name:");

		String empFname=scanner.next();
		System.out.println("Enter Employee Last name:");

		String empLname=scanner.next();
		System.out.println("Enter Employee Salary:");

		int empSalary=scanner.nextInt();
		
		String empName=empFname+" "+empLname;
		
		Employee employee= new Employee(empId, empLname, empName, empSalary);
		
		System.out.println(employee);
		
		System.out.println("Annual salary for this employee will be: "+employee.getAnnualSalary());
		
		System.out.println("You may raise the salary by entering salary percent here:");
		
		int raiserdPercent=scanner.nextInt();
		System.out.println("By raising salary with "+raiserdPercent+" Salary becomes:"+employee.raiseSalary(raiserdPercent));
	}
}
