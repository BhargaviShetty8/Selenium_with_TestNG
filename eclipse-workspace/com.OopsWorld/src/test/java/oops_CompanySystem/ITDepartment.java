package oops_CompanySystem;

import java.util.ArrayList;
import java.util.List;

public class ITDepartment extends DepartmentAbstractClass {
	
	private double totalBudget;
	private List<Employee> emp = new ArrayList<>(); 
	

	@Override
	public void assignEmployee(Employee employee) {
		emp.add(employee);
		System.out.println("Assigned " +employee.getName() + "to IT department");
		
	}

	@Override
	public double calculateBudget() {
		for(Employee employee:emp) {
			totalBudget+=employee.getSalary();
		}
		return totalBudget;
	}

}
