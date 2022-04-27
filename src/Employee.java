import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		
	Scanner S = new Scanner(System.in);
	System.out.println("Enter the Employee ID : ");
	int EmployeeID = S.nextInt();
	System.out.println("Employee ID : "+EmployeeID);
	
	System.out.println("Enter the Employee Name : ");
	S.nextLine();
	String Name = S.nextLine();
	System.out.println("Employee Name : "+Name);
	
	System.out.println("Enter the Employee Email : ");
	String Email = S.next();
	System.out.println("Employee Email : "+Email);
	
	System.out.println("Enter the Employee PhoneNo : ");
	long PhoneNo = S.nextLong();
	System.out.println("Employee PhoneNo : "+PhoneNo);
	
	System.out.println("Enter the Employee Salary : ");
	float Salary = S.nextFloat();
	System.out.println("Employee Salary : "+Salary);
	
	System.out.println("Enter the Employee Gender : ");
	String Gender = S.next();
	System.out.println("Employee Gender : "+Gender);
	
	System.out.println("Enter the Employee City : ");
	S.nextLine();
	String City = S.nextLine();
	System.out.println("Employee City : "+City);
	
	}
}
