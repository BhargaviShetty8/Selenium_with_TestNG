package oops_CompanySystem;

public class QA extends Employee {

	private String testing;
	
	public QA(String Name, int age, int salary, String testing) {
		super(Name, age, salary);
		this.testing=testing;
	}
	public String getTesting() {
		return testing;
	}
	
	public void setTesting() {
		this.testing=testing;
	}
	
	public double calculateBonus() {
		return getSalary()*0.13;
	}
}
