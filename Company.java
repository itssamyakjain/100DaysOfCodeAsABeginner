class Employee{
	// class attributes
	int salary;
	int id;
	String name;
	
	// returns id number
	public int getid() {
		return id;
	}
	
	// sets the id number
	public void setid(int id) {
		this.id = id;
	}
	
	// returns the salary
	public int getSalary() {
		return salary;
	}
	
	// sets the salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// returns the name
	public String getName() {
		return name;
	}
	
	// sets the name
	public void setName(String name) {
		this.name = name;
	}
	
	// prints the details of the employee object
	public void printDetails() {
		System.out.println("Hello , it's id number "+id);
		System.out.println("My name is "+name+" and my salary is "+salary);
		
	}
	
}



public class Company{
	
	public static void main(String[] args) {
		
		// instantiating a new Employee object 
		Employee employee1 = new Employee();
		
		// setting the attributes for employee1
		employee1.setid(512);
		employee1.setName("Raj Agrawal");
		employee1.setSalary(34000);
		
		// printing the attributes
		employee1.printDetails();
		
	}
}
