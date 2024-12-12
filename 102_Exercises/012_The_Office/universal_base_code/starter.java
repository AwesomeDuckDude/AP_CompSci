/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Employee nam = new Employee(437339, "Noah", "Nam", 0.1);
		
		dwight.raiseSalary(15);
		jim.raiseSalary(15);
		pam.raiseSalary(15);
		nam.raiseSalary(15);
		
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		nam.employeeToString();
		
		
	}
}
