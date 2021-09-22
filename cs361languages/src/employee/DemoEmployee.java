/**
 * 
 */
package employee;

/**
 * @author Seth K. and Sam V.
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		// emp3.whoAmI() // prints ... because ...
		//**Answer: emp3.whoAmI() prints "PART TIME EMPLOYEE" because it casts from the Employee
		// class which is then overwritten by the child class PartTimeEmployee when emp3 = pEmp1, and
		// within that class is the whoAmI method which prints "PART TIME EMPLOYEE" when called.

		// emp3.getHourlyRate(); // returns syntax error because ...
		//**Answer: emp3.getHourlyRate(); returns a syntax error because emp3 was instantiated as an
		// Employee type, which does not have a getHourlyRate method nor is a method that takes
		// a 4th set of values when instantiated like the PartTimeEmployee class.
		

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		//PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete
		// This instruction compiles / does not compile
		// This instruction returns a ClassCastException at run time
		// because ...
		//**Answer: This instruction does not compile and returns a ClassCastException at run time
		//  because the Employee class is not a subclass of the PartTimeEmployee class thus will not allow casting.

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
