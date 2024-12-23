package oops_CompanySystem;

public class Developer extends Employee {

	private String domain;
	
	public Developer(String Name, int age, int salary, String domain) {
		super(Name, age, salary);
		this.domain = domain;
		
	}

	public String getdomain() {
		return domain;
	}
	 
	public void setdomain() {
		this.domain=domain;
	}
	
	public double calculateBonus() {
		return getSalary()*0.15;
	}
	
	
	
	
}
