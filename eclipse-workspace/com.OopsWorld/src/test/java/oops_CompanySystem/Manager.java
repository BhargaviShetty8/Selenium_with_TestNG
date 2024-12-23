package oops_CompanySystem;

public class Manager extends Employee {

	private double teamBudget;
	
	public Manager(String Name, int age, int salary, double teamBudget) {
		super(Name, age, salary);
		this.teamBudget= teamBudget;
	}

	public double getTeamBudget() {
		return teamBudget;
	}
	
	public void setTeamBudget(double TeamBudget) {
		this.teamBudget = teamBudget;
	}
	
	public double calculateBonus() {
		return getSalary()*0.2 ;
	}
	
	
}
