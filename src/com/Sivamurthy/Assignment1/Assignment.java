package com.Sivamurthy.Assignment1;
import com.Sivamurthy.Assignment1.employees.*;
import com.Sivamurthy.Assignment1.utilities.*;

public class Assignment {

	public static void main(String[] args) {
		
		    
		        Manager manager = new Manager("Siva", "A101", 90000, "HR");
		        Developer developer = new Developer("Murthy", "B202", 80000, "Java");

		        System.out.println("Manager Details:");
		        EmployeeUtilities.printEmployeeDetails(manager);
		        EmployeeUtilities.increaseSalary(manager, 10);

		        System.out.println("\nDeveloper Details:");
		        EmployeeUtilities.printEmployeeDetails(developer);
		        EmployeeUtilities.increaseSalary(developer, 15);
		    }
		}

	