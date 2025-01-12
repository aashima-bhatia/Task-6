package task;

public class Employee {
	//Attributes
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
			
	//Constructor
	public Employee(int id, String firstName, String lastName, int salary) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
	}
	// getter for ID
	public int getID() {
			return id;
	}
	// getter for firstname
	public String getfirstName() {
			return firstName;
	}
	// Getter for lastName
	public String getLastName() {
		    return lastName;
	}
	public String getName() {
		    return firstName + " " + lastName;
	}
	// getter for salary
	public int getSalary() {
			return salary;
	}
			
	// setter for salry
	public void setSalary(int salary) {
			this.salary = salary;
	}
	public int getAnnualSalary() {
			return salary * 12;
	}
	// method to raise salary by percentage
	public int raiseSalary(int percent) {
		salary += salary * percent/100;
		return salary;
	}
	// to string method
	@Override
	public String toString() {
		return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// creating an employee object
		Employee emp = new Employee(1,"Aashima","Bhatia",100000);
		// Testing methods
        System.out.println("ID: " + emp.getID());
        System.out.println("First Name: " + emp.getfirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Full Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
     // Raising salary by 10%
        System.out.println("Salary after 10% raise: " + emp.raiseSalary(10));
     // Displaying employee details using toString
        System.out.println(emp.toString());
	}

}
