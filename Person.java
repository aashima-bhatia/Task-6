package task;

public class Person {
	//Attributes
	private String name;
	private int age;
	
	//Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// getter method for name
	public String getName() {
		return name;
	}
	// getter method for age
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// create an object of person class
		Person person = new Person("Aashima Bhatia",24);
		// access and print attributes using getter methods
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}

}
