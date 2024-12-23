package oops_CompanySystem;

public class Employee {

	private String Name;
	private int age;
	private double salary;
	
	public Employee(String Name, int age, int salary) {
		this.Name = Name;
		this.age = age;
		setAge(age);
		setSalary(salary);
		
	}
	public String getName() {
		return Name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int setAge(int salary) {
		
		if(age>0) {
			this.age=age;
		}else {
			throw new IllegalArgumentException("Age cannot be Negative");
		}
		return age;
		
	}
		
	public double getSalary() {
		return salary;
	}
	
	public double setSalary(double salary) {
		if(salary>=0) {
			this.salary=salary;
		}else {
			throw new IllegalArgumentException ("Salary can't be negative");
		}
		return salary;
	}
	
	public double calculateBonus() {
		return salary*0.1;
		
	}
	
	public void DisplayDetails() {
		System.out.println("Name: "+ Name + "Age: " + age + "Salary: " +salary );
		
	}

}
